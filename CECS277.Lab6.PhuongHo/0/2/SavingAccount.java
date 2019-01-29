
public class SavingAccount 
{
	private double balance;
	
	SavingAccount()
	{
		balance = 0.00;
	}
	
	SavingAccount(double bl)
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

	public double yearlyBalance(double initialBalance, double anualRate)
	{
		double interest = initialBalance * anualRate / 100;
		double result = initialBalance += interest;
		return result;
	}
}