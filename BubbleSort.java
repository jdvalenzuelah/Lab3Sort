// Importamos clases Necesarias
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;

public class BubbleSort{
// ----------------------------------- BubbleSort --------------------------------------
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

