import java.util.Random;

public class PruebaSorts{

	public static void main(String[] args) {
		Comparable[] list = new Integer[25];
		
		System.out.println(RandomListGenerator.intFile("data.txt", 10));

		
		/*
		for(int i = 0; i < 25; i++){
			list[i] = random.nextInt(30);
		}

		System.out.println("Random");
		for(Comparable element: list){
			System.out.print(element + ",");
		}

		list = QuickSort.sort(list,0,24);

		System.out.println("\nSorted");
		for(Comparable element2 : list){
			System.out.print(element2 + ",");
		}*/


	}
}