import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class BankAccount 
{
	public static final double MAX_BALANCE = 100000;
	private double balance;
	private Lock balanceChangeLock;
	private Condition sufficientFundsCondition;
	private Condition lessThanMaxBalanceCondition;
	
	public BankAccount()
	{
		balance = 0;
		balanceChangeLock = new ReentrantLock();
		sufficientFundsCondition = balanceChangeLock.newCondition();
		lessThanMaxBalanceCondition = balanceChangeLock.newCondition();
	}
	
	public void deposit(double amount) throws InterruptedException
	{
		balanceChangeLock.lock();
		try
		{
			while (balance + amount > MAX_BALANCE)
				lessThanMaxBalanceCondition.await();
			System.out.print("Depositting " + amount);
			double newBalance = balance + amount;
			System.out.println(", new balance is " + newBalance);
			balance = newBalance;
			sufficientFundsCondition.signalAll();
		}
		finally
		{ 
			balanceChangeLock.unlock(); 
		}
	}
	
	public void withdraw(double amount) throws InterruptedException
	{
		balanceChangeLock.lock();
		try
		{
			while (balance < amount)
				lessThanMaxBalanceCondition.await();
			System.out.print("Withdrawing " + amount);
			double newBalance = balance - amount;
			System.out.println(", new balance is " + newBalance);
			balance = newBalance;
			lessThanMaxBalanceCondition.signalAll();
		}
		finally
		{ 
			balanceChangeLock.unlock(); 
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
}


