package lesonnumber5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader01 {

	public static void main(String[] args) throws FileNotFoundException {
		String path ="C:\\Users\\md ismail hossain\\Desktop";
         FileReader fileReader = new FileReader(path);
         System.out.println(path);

	}
 
}
