//Autores: Josue Valenzuela 171001 y  Fernando Hengstenberg 17699, con la ayuda del codigo de: Rajat Mishra.
// Importamos clases necesarias


class QuickSort{

// ------------------------------- Quick Sort ------------------------------------------
// Codigo obtenido de: http://www.geeksforgeeks.org/iterative-quick-sort/
/*This code is contributed by Rajat Mishra */
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
	/**
	 * Funcion toma el ultimo elemento de la lista como un pivot, el pivot es colocado en la posicion correcta
	 * en la lista ordenada, y coloca todos los elementos menores a la derecha y todo los mayores a la izquierda.
	 * @param arr Lista de datos
	 * @param low Index del primer elemento
	 * @param high Index del ultimo elemento
	 * @return
	 */
   public static int partition(Comparable arr[], int low, int high){
        Comparable pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j].compareTo(pivot) <= 0 )
            {
                i++;
 
                // swap arr[i] and arr[j]
                Comparable temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        Comparable temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
   /**
    * Funcion principal que ordena una lista de objetos que implementan la clase Comparable utilizando QuickSort
    * @param arr
    * @param low
    * @param high
    * @return
    */
    public static Comparable[] sort(Comparable arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
        return arr;
    }
//--------------------------------------------------------------------------------------



    

}
