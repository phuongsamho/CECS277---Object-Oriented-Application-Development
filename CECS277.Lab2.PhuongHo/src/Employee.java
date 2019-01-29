import java.util.Calendar;
/**Employee class is the abstract base class generating all employee info. 
 * @author Phuong Ho - 011056693
 * @version September 22 2013
 * Lab 2 CECS277
 */
public abstract class Employee implements Comparable<Object>
{
	private String Name;
	private String ID;
	private String Gender;
	protected Calendar Birthdate;
	
	/**Default Constructor
	 */
	public Employee()
	{
		Name = "Last, First";
		ID = "000";
		Gender = "M/F";
		Birthdate = Calendar.getInstance();
		Birthdate.set(1989, 01, 01);
	}
	
	/** Argument Constructor
	 * @param name: Employee's Name
	 * @param id: Employee'sID 
	 * @param gender: Employee's Gender
	 * @param birthdate: Employee's Birthdate
	 */
	public Employee(String name, String id, String gender, Calendar birthdate)
	{
		Name = name;
		ID = id;
		Gender = gender;
		Birthdate = birthdate;
	}
	
	/** Printing Employee's information 
	 * @return Employee's information
	 */
	public String toString()
	{
		return ("ID Employee Number: " + ID + "\nEmployee Name: " + Name
				 + "\nBirth date: " + Birthdate.get(Calendar.MONTH) + "/"
				 + Birthdate.get(Calendar.DATE) + "/" 
				 + Birthdate.get(Calendar.YEAR));
	}
	
	/**Name Setter
	 * @param name: Employee's Name
	 */
	public void setName(String name)
	{
		Name = name;
	}
	
	/**ID Setter
	 * @param ID: Employee's ID
	 */
	public void setID(String id)
	{
		ID = id;
	}
	
	/**Gender Setter
	 * @param Gender: Employee's Gender
	 */
	public void setGender(String gender)
	{
		Gender = gender;
	}
	
	/**Birth date Setter
	 * @param name: Employee's Birth date
	 */
	public void setBirthdate(Calendar birthdate)
	{
		Birthdate = birthdate;
	}
	
	/**Name Getter
	 * @return Employee's Name
	 */
	public String getName()
	{
		return Name;
	}
	
	/**ID Getter
	 * @return Employee's ID
	 */
	public String getID()
	{
		return ID;
	}
	
	/**Gender Getter
	 * @return Employee's Gender
	 */
	public String getGender()
	{
		return Gender;
	}
	
	/**Birth Date Getter
	 * @return Employee's Birth Date
	 */
	public Calendar getBirthdate()
	{
		return Birthdate;
	}
	
	/**Giving the monthly earning for each Employee
	 * @return monthly earning of each Employee
	 */
	public abstract double monthlyEarning();
	
	/**Compares two Employee's ID numbers. 
	 * @param oObject to compare
	 * @return 1 if the Employee's ID number is less than Object's ID number, -1
	 *         if greater, and 0 if they equal.
	 */
	@Override
	public int compareTo(Object o)
	{
		int answer = this.ID.compareTo(((Employee)o).ID);
		return answer;
	}
}