package lastNight;

import java.util.Scanner;

public class DiabeticCondition {

	public static void main(String[] args) {
		System.out.println("<-- Please Enter your Hemoglobin A1C value below -->");
		
	Scanner scanner =new Scanner(System.in);
	double hbga1c=scanner.nextDouble();
	if(hbga1c>6.4) {	
		System.out.println("I am a diabetic pation");
	}else if(hbga1c>=5.7) {
		System.out.println("I am a pre-diabetic pation");
	}else if(hbga1c<5.7) {
		System.out.println("I am healthy person");
	}scanner.close();
	
}
}