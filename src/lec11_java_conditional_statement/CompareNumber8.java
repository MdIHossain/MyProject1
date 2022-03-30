package lec11_java_conditional_statement;

import java.util.Scanner;

public class CompareNumber8 {

	public static void main(String[] args) {
		System.out.println("<--- Please enter 2 value below to compare them --->");
		Scanner scanner = new Scanner(System.in);
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		if(val1 % 2 ==0 && val1 < val2) {
			System.out.println(val1 + " is an even number and " + val1 + " is less than " + val2);
		}else if(val1% 2 ==1 && val1 < val2) {
			System.out.println(val1 + " is odd number and "  +  val1 + "is less than "  + val2);
	}else if(val1 % 2 ==0 || val1 < val2) {
			System.out.println(val1 + " is an even number or " + val1 + " is less than " + val2);
		}else if(val1 % 2 == 1 || val1 < val2) {
			System.out.println(val1 + " is an odd number or " + val1 + " is less than " + val2);
			
		}
	}

}
