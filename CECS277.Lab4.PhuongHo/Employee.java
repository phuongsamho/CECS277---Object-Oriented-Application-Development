public class Employee implements Comparable
{
	private String fName;
	private String lName;
	private int ID;
	private String Scale;
	
	Employee()
	{
		fName = "";
		lName = "";
		ID = 0;
		Scale = "";
	}
	Employee(String first, String last, int id, String scale)
	{
		fName = first;
		lName = last;
		ID = id;
		Scale = scale;
	}
	
	public void setFirst(String first)
	{
		fName = first;
	}
	public void setLast(String last)
	{
		lName = last;
	}
	public void setID(int id)
	{
		ID = id;
	}
	public void setScale(String scale)
	{
		Scale = scale;
	}
	
	public String getFirst()
	{
		return fName;
	}
	public String getLast()
	{
		return lName;
	}
	public int getID()
	{
		return ID;
	}
	public String getScale()
	{
		return Scale;
	}
	
	public String toString()
	{
		return (lName + ", " + fName + " - ID: " + ID + " - Scale: " + Scale);
	}
	
	@Override
	public int compareTo(Object o) 
	{
		Employee e = (Employee) o;
		if (this.lName.equals(((Employee) o).lName))
		{
			if (this.fName.equals(((Employee) o).fName))
			{
				return (this.ID - e.getID());
			}
			else return (this.fName.compareTo(((Employee) o).fName));
		}
		else return (this.lName.compareTo(((Employee) o).lName));
	}
	
	@Override
	public boolean equals(Object o) 
	{
	    Employee e = (Employee) o;
	    if ((this.lName == e.lName) && (this.fName == e.fName) && (this.ID == e.ID))
	        return false;
	    return true;
	}
	
	public int hashCode()
	{
		int h1 = new Double(ID).hashCode();
		int h2 = fName.hashCode();
		int h3 = lName.hashCode();
		return h1 * 12 + h2 * 26 + h3;
	}
	
}
