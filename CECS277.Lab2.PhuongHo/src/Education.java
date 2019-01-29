
public class Education implements Cloneable
{
	private String Degree;
	private String Major;
	private int Research;
	
	public Education()
	{
		Degree = "default";
		Major = "default";
		Research = 0;
	}
	
	public Education(String degree, String major, int research)
	{
		Degree = degree;
		Major = major;
		Research = research;
	}
	
	public void setDegree(String degree)
	{
		Degree = degree;
	}
	
	public void setMajor(String major)
	{
		Major = major;
	}
	
	public void setResearch(int research)
	{
		Research = research;
	}
	
	public String getDegree()
	{
		return Degree;
	}
	
	public String getMajor()
	{
		return Major;
	}
	
	public int getResearch()
	{
		return Research;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
