//David Valenzuela 		1171001
//Fernando Hengstenberg	17699
// Java Program to implement Gnome Sort

import java.util.Arrays;
public class GnomeSort
{
	/**
	 * @param arr Array a ordenar	
	 * @param n tamaño del array
	 * @return Array ya ordenaado
	 */
	public static Comparable[] gnomeSort(Comparable[] arr, int n)
	{
		int index = 0;

		while (index < n)
		{
			if (index == 0)
				index++;
			if (arr[index].compareTo(arr[index-1]) >= 0)
				index++;
			else
			{
				Comparable temp;
				temp = arr[index];
				arr[index] = arr[index-1];
				arr[index-1] = temp;
				index--;
			}
		}
		return arr;
	}
	
}

// Code Contributed by Mohit Gupta_OMG
// Extraido de https://ide.geeksforgeeks.org/index.php