// Importamos clases Necesarias
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;

public class BubbleSort{
// ----------------------------------- BubbleSort --------------------------------------
	public static int[] bubbleSort(int[] numArray) {
    int n = numArray.length;
    int temp = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 1; j < (n - i); j++) {

            if (numArray[j - 1] > numArray[j]) {
                temp = numArray[j - 1];
                numArray[j - 1] = numArray[j];
                numArray[j] = temp;
            }

        }
    }
    return numArray;
}
//--------------------------------------------------------------------------------------

	
}

