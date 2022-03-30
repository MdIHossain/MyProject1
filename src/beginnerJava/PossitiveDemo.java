package beginnerJava;

import java.util.Scanner;

public class PossitiveDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Enter any int number");
		num = input.nextInt();
		if(num>0) {
			System.out.println("possitive");
		}else if(num<0) {
			System.out.println("Nagatite");
		}
		else {
			System.out.println("Equel to zero");
		}
	}

}
 