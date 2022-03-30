package lec09_java_different_0f_class;

import java.util.Scanner;

public class Use_of_scanner_class03 {
	public static void main(String[] args) {
		System.out.println("please put value here");
		Scanner scanner = new Scanner(System.in);
		int val1 =scanner.nextInt();
		int val2 =scanner.nextInt();
		int sum = val1 +val2;
		System.out.println("\nThe sum of val1 and val2 is " + sum);
		scanner.close();
	}

}
