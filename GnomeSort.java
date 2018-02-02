//David Valenzuela 		1171001
//Fernando Hengstenberg	17699
// Java Program to implement Gnome Sort

import java.util.Arrays;
public class GnomeSort
{
	static void gnomeSort(int arr[], int n)
	{
		int index = 0;

		while (index < n)
		{
			if (index == 0)
				index++;
			if (arr[index] >= arr[index-1])
				index++;
			else
			{
				int temp =0;
				temp = arr[index];
				arr[index] = arr[index-1];
				arr[index-1] = temp;
				index--;
			}
		}
		return;
	}

	// Driver program to test above functions.
	
}

// Code Contributed by Mohit Gupta_OMG
// Extraido de https://ide.geeksforgeeks.org/index.php