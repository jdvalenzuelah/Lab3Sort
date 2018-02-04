
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;

public class RandomListGenerator {

	public static String intFile(String filePath, int listSize) {
		try{
			PrintWriter file = new  PrintWriter(filePath, "UTF-8");
			Random random = new Random();
			for(int i = 0; i < listSize; i++){
				file.print(random.nextInt(10000) + ",");
			}
			file.close();

		}catch (IOException e){
			return e.getMessage();
		}finally{
			return "File generated succesully";
		}
	}

}