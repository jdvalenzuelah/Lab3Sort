import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class SortsOrdenados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press any key to start...");
		sc.next();

		for(int i = 10; i < 3001; i++) {
			System.out.println(RandomListGenerator.sortedIntFile("data.txt", i) + " Run: "+ i);
			Integer[] list = RandomListGenerator.getData("data.txt");
			long start = System.nanoTime();
			MergeSort.sort(list,i);
			long end = System.nanoTime();
			long duration = (end - start)/1000;
			try{
				writeLog(i + ",QuickSort," + "VERDADERO,QuickSort.sort(java.lang.Comparable[ ], int),VERDADERO,"+duration);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Press any key to exit...");
		sc.next();
	}

	public static void writeLog(String line) throws java.io.IOException {
        FileWriter file = new FileWriter("mergeSort.csv", true);
        file.append(line+"\n");
        file.flush();
        file.close();
    }
}