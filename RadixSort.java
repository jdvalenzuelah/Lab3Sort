// David Valenzuela		171001
//Fernando Hengstenberg 17699
// Radix sort Java implementation


import java.io.*;
import java.util.*;

class RadixSort {

	// Una función de utilidad para obtener el valor máximo en arr []
	static int getMax(Integer arr[], int n)
	{
		int mx = arr[0];
		for (int i = 1; i < n; i++)
			if (arr[i] > mx)
				mx = arr[i];
		return mx;
	}

	
	// Una función para hacer el conteo tipo de arr [] según
	// el dígito representado por exp.
	static void countSort(Integer arr[], int n, int exp)
	{
		int output[] = new int[n]; 
	// matriz de salida
		int i;
		int count[] = new int[10];
		Arrays.fill(count,0);

		
		// Almacena el recuento de las ocurrencias en el count[]
		for (i = 0; i < n; i++)
			count[ (arr[i]/exp)%10 ]++;

		// Cambiar count[i] para que el count[i] ahora contenga
		// posición real de este dígito en la salida output[]
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		
		// Construye la matriz de salida
		for (i = n - 1; i >= 0; i--)
		{
			output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
			count[ (arr[i]/exp)%10 ]--;
		}

		
		// Copia la matriz de salida a arr [], por lo que arr [] ahora
		// contiene números ordenados de acuerdo con el dígito actual
		for (i = 0; i < n; i++)
			arr[i] = output[i];
	}

		
		// La función principal para eso ordena arr [] de tamaño n usando
		// Radix Sort
	static void radixSort(Integer arr[], int n)
	{
		
		// Encuentra el número máximo para saber la cantidad de dígitos
		int m = getMax(arr, n);

		
		// Hacer un conteo ordenado para cada dígito. Tenga en cuenta que en cambio
		// del número de dígito que pasa, exp se pasa. exp es 10 ^ i
		// donde estoy el número de dígito actual
		for (int exp = 1; m/exp > 0; exp *= 10)
			countSort(arr, n, exp);
	}



	
/* Función de controlador para verificar la función anterior */
					
	
}
/* This code is contributed by Devesh Agrawal */
/*Extraido de https://ide.geeksforgeeks.org/index.php */
