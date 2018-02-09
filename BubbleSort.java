

public class BubbleSort{
// ----------------------------------- BubbleSort --------------------------------------
	/**
	 * Metodod que implementa bubble sort para objetos d¿que implemente la clase comparable
	 * @param comArray lista de objetos a ordenar (de memor a mayor).
	 * @return Lista de objetos ordenada
	 */
	public static Comparable[] bubbleSort(Comparable[] comArray) {
    int n = comArray.length;
    Comparable temp = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 1; j < (n - i); j++) {

            if (comArray[j - 1].compareTo(comArray[j]) > 0) {
                temp = comArray[j - 1];
                comArray[j - 1] = comArray[j];
                comArray[j] = temp;
            }

        }
    }
    return comArray;
}
//--------------------------------------------------------------------------------------

	
}

