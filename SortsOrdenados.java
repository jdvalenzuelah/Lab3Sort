import java.util.Scanner;

public class SortsOrdenados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press any key to start...");
		sc.next();
		for(int i = 10; i < 3001; i++){
			System.out.println(RandomListGenerator.sortedIntFile("data.txt", i) + " Run: "+ i);
			Integer[] list = RandomListGenerator.getData("data.txt");
			MergeSort.sort(list, i);
			QuickSort.sort(list, 0,i-1);
		}
		System.out.println("Press any key to exit...");
		sc.next();
	}
}