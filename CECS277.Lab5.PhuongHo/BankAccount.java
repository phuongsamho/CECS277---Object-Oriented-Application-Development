
public class BankAccount 
{
	private double balance;
	
	BankAccount()
	{
		balance = 0.0;
	}
	
	BankAccount(double bl)
	{
		balance = bl;
	}
	
	public void setBalance(double bl)
	{
		balance = bl;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
	}
}

