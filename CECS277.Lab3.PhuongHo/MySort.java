
public class MySort
{
	public static void InsertionSort(Comparable[] theArray, int n)
	{
		for (int unsorted = 1; unsorted < n; ++unsorted) 
		{
			Comparable nextItem = theArray[unsorted];
			int loc = unsorted;
			while ((loc > 0) && (theArray[loc-1].compareTo((Comparable) nextItem) > 0)) 
			{
				theArray[loc] = theArray[loc-1];
				loc--;
			}
			theArray[loc] = nextItem;
		} 
	}

}

//http://www.daniweb.com/software-development/java/threads/347069/insertion-sort-method-using-comparable-array