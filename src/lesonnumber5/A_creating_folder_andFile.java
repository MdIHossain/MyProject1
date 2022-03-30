package lesonnumber5;

import java.io.File;

public class A_creating_folder_andFile {

	public static void main(String[] args) {
		File folder = new File("C:\\Users\\md ismail hossain\\Desktop\\iyaad");
		folder.mkdir();
		if(folder.exists()) {
			System.out.println(folder.getName() +"folder is created");
			File file = new File("C:\\Users\\md ismail hossain\\Desktop\\ismail");
			try {
				file.createNewFile();
			}catch(Exception e) {
				System.out.println();
		 }if(file.exists()) {
			System.out.println(file.getName());
			}
		}

	}

}
