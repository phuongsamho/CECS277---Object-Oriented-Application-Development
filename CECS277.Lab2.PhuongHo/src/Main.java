import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;

import javax.xml.parsers.FactoryConfigurationError;
public class Main 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		//Creating Employee Array
		Employee[] e = new Employee[9];
		Calendar staffBirthDate0 = Calendar.getInstance();
		Calendar staffBirthDate1 = Calendar.getInstance();
		Calendar staffBirthDate2 = Calendar.getInstance();
		Calendar facBirthdate0 = Calendar.getInstance();
		Calendar facBirthdate1 = Calendar.getInstance();
		Calendar facBirthdate2 = Calendar.getInstance();
		Calendar ptBirthdate0 = Calendar.getInstance();
		Calendar ptBirthdate1 = Calendar.getInstance();
		Calendar ptBirthdate2 = Calendar.getInstance();
		staffBirthDate0.set(1959, 2, 23);
		staffBirthDate1.set(1964, 7, 12);
		staffBirthDate2.set(1970, 6, 2);
		facBirthdate0.set(1962, 4, 27);
		facBirthdate1.set(1975, 3, 14);
		facBirthdate2.set(1980, 5, 22);
		ptBirthdate0.set(1977, 8, 10);
		ptBirthdate1.set(1987, 9, 15);
		ptBirthdate2.set(1988, 11, 24);
		e[0] = new Staff("Chan, Scott", "123", "M", staffBirthDate0, 35.00);
		e[1] = new Staff("Salinas, Brian", "456", "F", staffBirthDate1, 30.00);
		e[2] = new Staff("Weir, Allen", "789", "M", staffBirthDate2, 22.00);
		e[3] = new Faculty("Im, Lee", "234", "F", facBirthdate0, 
				"FU", "Ph.D", "Enginerring", 3);
		e[4] = new Faculty("Bui, Trung", "791", "F", facBirthdate1, 
				"AO", "Ph.D", "English", 1);
		e[5] = new Faculty("Monreno, Maria", "623", "F", facBirthdate2, 
				"AS", "MS", "Physical Education", 0);
		e[6] = new PartTime("Lee, Chesong", "455", "F", ptBirthdate0, 
				35.00, 20);
		e[7] = new PartTime("Garcia, Frank", "678", "F", ptBirthdate1, 
				30.00, 25);
		e[8] = new PartTime("Alquilo, Roscoe", "945", "M", ptBirthdate2, 
				20.00, 30);
		
		//a. + b + c.
		//Printing Employee Information
		System.out.println("EMPLOYEE INFORMATION\n");
		for (int i = 0; i < e.length; i++ )
		{
			if (e[i] instanceof PartTime)
			{
				System.out.println("Part Time\n" + e[i].toString() + "\n");
			}
			else if (e[i] instanceof Staff)
			{
				System.out.println("Staff\n" + e[i].toString() + "\n");
			}
			else if (e[i] instanceof Faculty)
			{
				System.out.println("Faculty\n" + e[i].toString() + "\n");
			}
		}
		System.out.println("**************************");
		
		//d.
		//Clone testing
		Calendar facBirthDate4 = Calendar.getInstance();
		facBirthDate4.set(1962, 4, 27);
		Faculty facObj = new Faculty("Hey, Ho", "111", "F", facBirthDate4, 
				"AO", "Ph.D", "CS", 2);
		System.out.println("Creating a new Faculty object named facObj: \n" + facObj + "\n");
		Faculty clonedFac = (Faculty ) facObj.clone();
		System.out.println("Clone it with a new object named cloneFac,");
		System.out.println(clonedFac);
		System.out.println("\nChanging info (name, ID, and Level) in original Faculty object....");
		facObj.setName("Yo, Lo");
		facObj.setID("000");
		facObj.setLevel("FU");
		System.out.println(facObj);
		System.out.println("\nCloned Faculty object is still the same: \n" + clonedFac + "\n");
		System.out.println("**************************");	
		
		//e.
		//Check if 2 Staff object are the same
		Calendar staffBirthDate7 = Calendar.getInstance();
		Staff s1 = new Staff("Yo, Lo", "999", "M", staffBirthDate7, 35.00);
		staffBirthDate7.set(1964, 7, 12);
		System.out.println(s1);
		System.out.println(s1.getHourlyRate() + "\n");
		Calendar staffBirthDate8 = Calendar.getInstance();
		Staff s2 = new Staff("Mo, Jo", "000", "F", staffBirthDate8, 45.00);
		staffBirthDate8.set(1975, 9, 22);
		System.out.println(s2);
		System.out.println(s2.getHourlyRate() + "\n");
		if (s1.CompareTo(s2))
			System.out.println("The two staffs are the same.");
		else System.out.println("The two staffs are NOT the same.");
		System.out.println("\n**************************");	
		
		//f.
		//Printing info in ascending order by Employee ID
		Arrays.sort(e);
		System.out.println("EMPLOYEES IN ASCENDING ORDER:\n" );
		for(int i = 0; i < e.length; i++) 
		    System.out.println(e[i] + "\n");
		
		//g.
		//Printing info in descending order by Employee ID
		System.out.println("**************************");
		System.out.println("EMPLOYEES IN DESCENDING ORDER: \n" );
		Arrays.sort(e, new EmpIDDes());
		for(int i = 0; i < e.length; i++) 
			System.out.println(e[i] + "\n");
			// 2nd way: reversed loop
		/*for(int i = e.length - 1; i >= 0; i--)
		{
			Arrays.sort(e);
		  System.out.println((i + 1) + "." + e[i] + "\n");
		}*/
	}
}
