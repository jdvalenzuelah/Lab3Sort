import java.util.Scanner;

public class SortsOrdenados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press any key to start...");
		sc.next();
		for(int i = 10; i < 3001; i++){
			System.out.println(RandomListGenerator.sortedIntFile("data.txt", i) + " Run: "+ i);
			RandomListGenerator.getData("data.txt");
			Integer[] list = RandomListGenerator.getData("data.txt");
			GnomeSort.gnomeSort(list, i);
			BubbleSort.bubbleSort(list);
			RadixSort.radixSort(list, i);
		}
	}
}