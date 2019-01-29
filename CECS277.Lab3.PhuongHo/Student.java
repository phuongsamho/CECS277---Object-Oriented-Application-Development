
public class Student implements Comparable
{
	private String ID;
	private String Name;
	Student()
	{
		ID = "";
		Name = "";
	}
	Student(String id, String name)
	{
		ID = id;
		Name = name;
	}
	public void setID(String id)
	{
		ID = id;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public String getID()
	{
		return ID;
	}
	public String getName()
	{
		return Name;
	}
	public String toString()
	{
		return (ID + " - " + Name);
	}
	@Override
	public int compareTo(Object o) 
	{
		int answer = this.ID.compareTo(((Student) o).ID);
		return answer;
	}
}
