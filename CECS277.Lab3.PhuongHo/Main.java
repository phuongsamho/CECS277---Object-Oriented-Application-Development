import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Integer[] in = {278, 458, 896, 677};
		System.out.println("The unsorted Integer array: ");
		for (int i = 0; i < in.length; i++)
		{
			System.out.println(i + 1 + ". " + in[i]);
		}
		System.out.println("Sorting...");
		MySort.InsertionSort(in, in.length);
		for (int i = 0; i < in.length; i++)
		{
			System.out.println(i + 1 + ". " + in[i]);
		}
		Student[] st = new Student[4];
		st[0] = new Student("456", "Nguyen, Baby");
		st[1] = new Student("234", "Smith, Puppy");
		st[2] = new Student("123", "Johnson, Kitty");
		st[3] = new Student("345", "Gonzalez, Cubby");
		System.out.println("\nThe unsorted Student array: ");
		for (int i = 0; i < st.length; i++)
		{
			System.out.println(i + 1 + ". " + st[i]);
		}
		System.out.println("After sorting by ID, the Student array will be: ");
		MySort.InsertionSort(st, st.length);
		for (int i = 0; i < st.length; i++)
		{
			System.out.println(i + 1 + ". " + st[i]);
		}
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the Student ID needed to search for a Student item: ");
		int i = input.nextInt();
		String id = Integer.toString(i);
		String name = "";
		Student s = new Student(id, name);
		BinarySearch bb = new BinarySearch(st);
		int n = bb.searching(s); 
		System.out.print("The item needed is: ");
		System.out.println(st[n].toString());
	}
}
