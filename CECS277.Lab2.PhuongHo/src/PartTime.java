import java.util.Calendar;


public class PartTime extends Staff 
{
	private double Hourperweek;
	
	public PartTime()
	{
		super();
		Hourperweek = 0.0;
	}
	
	public PartTime(String name, String id, String gender
			, Calendar birthdate, double hourlyrate, double hourperweek)
	{
		super(name, id, gender, birthdate, hourlyrate);
		Hourperweek = hourperweek;
	}
	
	public void setHourPerWeek(double hourperweek)
	{
		Hourperweek = hourperweek;
	}
	
	public double getHourPerWeek()
	{
		return Hourperweek;
	}
	
	public double monthlyEarning()
	{
		return (Hourperweek * super.getHourlyRate() * 4);
	}
	
	public String toString()
	{
		return ("ID Employee Number: " + super.getID() + "\nEmployee Name: " 
				+ super.getName() + "\nBirth date: " 
				+ super.getBirthdate().get(Calendar.MONTH) + "/"
				+ super.getBirthdate().get(Calendar.DATE) + "/" 
				+ super.getBirthdate().get(Calendar.YEAR) 
				+ "\nHours works per month: " + (Hourperweek * 4) 
				+ "\nMonthly Salary: " + monthlyEarning());
	}
}
