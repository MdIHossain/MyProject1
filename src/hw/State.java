package hw;

import java.util.Scanner;

public class State {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any int number");
		// here define a variable
		int age;
		age = input.nextInt();
		// initialize a variable
		int age1 = 38;
		if (age == 18) {
			System.out.println(" I am a voter" + age);
		} else if (age < 18) {
			System.out.println(" I am not a voter " + age);
		} else if (age >= 18) {
			System.out.println(" I am a voter " + age);
		} else {
			System.out.println(age + "My age is 38");
		}

	}

}
