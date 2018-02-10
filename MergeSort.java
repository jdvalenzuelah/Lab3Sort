public class MergeSort {

    private static Comparable[] numbers;
    private static Comparable[] helper;
    private static int number;

    /**
     * Funcion que implementa Merge sort para ordenar objetos de menor a mayor
     * @param values Lista a ordear
     * @param length Tamaño de la lista
     * @return Lista ya ordenada
     */
    public static Comparable[] sort(Comparable[] values, int length) {
        numbers = values;
        number = length;
        helper = new Comparable[number];
        mergesort(0, number - 1);
        return numbers;
    }

    /**
     * IMplementacion de merge sort
     * @param low indice dato mas bajo
     * @param high indice dato mas alto
     */
    private static void mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    /**
     * Implementacion de merge
     * @param low indice elemento mas pequeño
     * @param middle indice elemento medio
     * @param high indice elemento mas alto
     */
    private static void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i].compareTo(helper[j]) <=0) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }
        // Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.

    }
}