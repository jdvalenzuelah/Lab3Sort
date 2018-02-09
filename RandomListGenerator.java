
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

/**
 * @author Fernando Hengstenberg 17609
 * @author David Valenzuela 171001
 *
 */
public class RandomListGenerator {

	/**
	 * Genera un archivo de texto con una lista de n numeros enteros en orden aleatorio entre 0 y 10000 separados por una coma.
	 * @param filePath Direccion del archivo a generar la lista de numeros (Si existe sera sobre escrito, si no existe sera creado).
	 * @param listSize Tamaño de la lista de numeros a generar.
	 * @return Resultado de la operacion
	 */
	public static String intFile(String filePath, int listSize) {
		try{
			// Abrir el archivo o crear el archivo a generara con encoding UTF-8
			PrintWriter file = new  PrintWriter(filePath, "UTF-8");
			Random random = new Random(); // Ranndom object
			for(int i = 0; i < listSize; i++){
				file.print(random.nextInt(10000) + ","); // Entrada de numero aleatorio
			}
			file.close(); // Cerrar el archivo
			return "File generated succesully";
		}catch (IOException e){
			// En caso de error
			return e.getMessage();
		}
	}

  /**
   * Genera un archivo de texto con una lista de n numeros enteros en orden de 0 a listSize separados por una coma.
   * @param filePath Direccion del archivo a generar la lista de numeros (Si existe sera sobre escrito, si no existe sera creado).
   * @param listSize Tamaño de la lista de numeros a generar.
   * @return Resultado de la operacion
   */
  public static String sortedIntFile(String filePath, int listSize){
    try{
      // Abrir el archivo o crear el archivo a generara con encoding UTF-8
      PrintWriter file = new  PrintWriter(filePath, "UTF-8");
      for(int i = 0; i < listSize; i++){
        file.print(i + ","); // Entrada de numero aleatorio
      }
      file.close(); // Cerrar el archivo
      return "File generated succesully";
    }catch (IOException e){
      // En caso de error
      return e.getMessage();
    }
  }
	

    /**
     * Leer un archivo con numero separados por comas, y los convierte a una lista de string con los numeros en cada posicion
     * @return lista de numeros enteros encintrados en el archivo
     */
    public static Integer[] getData(String filePath){
        String records[];
        try{
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        reader.close();
        records = line.split(",");
        return strListToIntList(records);
        }
      catch(Exception e){
        System.err.format("Exception occurred trying to read");
        e.printStackTrace();
        return null;
      }
    }

    /**
     * Convertir una lista de string a una lista de Integers
     * @param strList lista de numeros en string
     * @return Lista de los valores en Integer
     */
    public static Integer[] strListToIntList(String[] strList) {
        Integer[] data = new Integer[strList.length];
        for(int i = 0;i<strList.length;i++) {
            data[i] = Integer.parseInt(strList[i]);
        }
        return data;
    }
    
    public static String writeFile(Comparable[] listS, String filePath) {
    	try {
    		PrintWriter file = new  PrintWriter(filePath, "UTF-8");
    		for(Comparable element : listS) {
    			file.print(element + ",");
    		}
    		file.print("0");
    		return "Writed Succesfully";
    		}catch(IOException e) {
    			return e.getMessage();
    		}
    }


}