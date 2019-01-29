import java.util.Calendar;

public class Faculty extends Employee implements EmployeeInfo, Cloneable
{
	private String Level;
	private Education Ed;
	
	public Faculty()
	{
		super();
		Level = "default";
		Ed = new Education("default", "default", 0);
	}
	
	public Faculty(String name, String id, String gender, Calendar birthdate, String level, 
			String degree, String major, int research)
	{
		super(name, id, gender, birthdate);
		Level = level;
		Ed = new Education(degree, major, research);
	}
	
	public void setLevel(String level)
	{
		Level = level;
	}
	
	public void setEd(Education ed)
	{
		Ed = ed;
	}
	
	public String getLevel()
	{
		return Level;
	}
	
	public Education getEd()
	{
		return Ed;
	}

	@Override
	public double monthlyEarning() 
	{
		if (Level == "AS")
			return FACULTY_MONTHLY_SALARY;
		else if (Level == "AO")
			return (FACULTY_MONTHLY_SALARY * 1.2);
		return (FACULTY_MONTHLY_SALARY * 1.4);
	}
	
	public String toString()
	{
		return (super.toString() + "\nXXXXX " + Ed.getDegree() +
				" XXXXX " + Level + "\nMonthly Salary: " + monthlyEarning());
	}
	
	public Object clone() throws CloneNotSupportedException 
	{
		Faculty clonedFac = (Faculty) super.clone(); 
		Education ed = (Education)Ed.clone();
		clonedFac.setEd(ed);
		return clonedFac;
	}
}