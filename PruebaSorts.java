import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class PruebaSorts {
	
	/*
	 * Lista de numeros desordenados
	 */
	public Integer[] unsortedList = {90,76,101,983,64,73,93};
	
	/*
	 * Lista de 
	 */
	public Integer[] sortedList = {64,73,76,90,93,101,983};
	
	
	@Test
	void bubbleSortTest() {
		Integer[] list = (Integer[]) BubbleSort.bubbleSort(unsortedList);
		assertEquals(sortedList, list);
	}
	
	@Test
	void gnomeSortTest() {
		Integer[] list = (Integer[]) GnomeSort.gnomeSort(unsortedList, unsortedList.length);
		assertEquals(sortedList, list);
	}

	@Test
	void mergeSortTest() {
		Integer[] list = (Integer[]) MergeSort.sort(unsortedList, unsortedList.length);
		assertEquals(sortedList, list);
	}
	
	@Test
	void quickSortTest() {
		Integer[] list = (Integer[]) QuickSort.sort(unsortedList, 0, unsortedList.length -1);
		assertEquals(sortedList, list);
	}
	
}
