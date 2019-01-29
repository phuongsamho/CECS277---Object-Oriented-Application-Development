import java.util.Calendar;
/**Faculty class is the children class extending from Employee Class
 * @author Phuong Ho - 011056693
 * @version September 22 2013
 * Lab 2 CECS277
 */
public class Staff extends Employee implements EmployeeInfo
{
	private double Hourlyrate;
	/**Default Constructor
	 */
	public Staff()
	{
		super();
		Hourlyrate = 0.0;
	}
	/**Argument Constructor
	 * @param name: Employee's Name
	 * @param id: Employee'sID 
	 * @param gender: Employee's Gender
	 * @param birthdate: Employee's Birthdate
	 * @param hourlyrate: Employee's Hourly Rate
	 */
	public Staff(String name, String id, String gender, Calendar birthdate
			, double hourlyrate)
	{
		super(name, id, gender, birthdate);
		Hourlyrate = hourlyrate;
	}
	/** Hourly Rate's Setter
	 * @param hourlyrate
	 */
	public void setHourlyRate(double hourlyrate)
	{
		Hourlyrate = hourlyrate;
	}
	
	public double getHourlyRate()
	{
		return Hourlyrate;
	}
	
	@Override
	public double monthlyEarning() 
	{
		return (STAFF_MONTHLY_HOURS_WORKED * Hourlyrate);
	}
	/** Printing Staff's information 
	 * @return Staff's information
	 */
	public String toString()
	{
		return (super.toString() + "\nFull time" + "\nMonthly Salary: " 
				+ monthlyEarning());
	}
	
	public boolean CompareTo(Staff o)
	{
		if (this.Hourlyrate == ((Staff)o).Hourlyrate)
			return true;
		return false;
	}
}
