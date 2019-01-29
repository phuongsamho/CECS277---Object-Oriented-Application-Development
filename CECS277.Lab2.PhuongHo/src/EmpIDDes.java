import java.util.Comparator;
public class EmpIDDes implements Comparator<Employee> 
{
	public int compare(Employee e1, Employee e2)
	{
		int id1 = Integer.parseInt(e1.getID());
		int id2  = Integer.parseInt(e2.getID());
		return id2 - id1;
	}
}
