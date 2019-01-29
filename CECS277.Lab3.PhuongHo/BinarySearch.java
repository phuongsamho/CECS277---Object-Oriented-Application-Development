public class BinarySearch<T extends Comparable<T>>
{
	private T[] a;
	
	BinarySearch(T[] array)
	{
		a = array;
	}
	
	public int searching(T x)
	{
		int low = 0;
        int high = a.length - 1;

        while (low <= high) 
        {
            int mid = (low + high) / 2;
            T midVal = a[mid];
            int result = x.compareTo(midVal);

            if (result < 0) high = mid - 1;

            else if (result > 0) low = mid + 1;

            else return mid;
        }
        return -1;
    }
}

//http://stackoverflow.com/questions/5426316/generic-binary-search-java