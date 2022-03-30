package nestedClass;

import nestedClass.LGA2.TerminalOne.TerminalThree;
import nestedClass.LGA2.TerminalOne.TerminalTwo;

public class LGA01 {// outer class
	TerminalOne t1 = new TerminalOne();
	TerminalTwo t2 = new TerminalTwo();
	TerminalThree t3 = new TerminalThree();
	// outer method
	public void welcome() {
		System.out.println("Welcome to LGA Airport");
	}// First inner class

	public class TerminalOne {

		public void destination() {

			System.out.println("Terminal One is for American Airlines");
		}}// Second inner class

		public class TerminalTwo {
			public void usAirlines() {
				System.out.println("Terminal Two is for us Airlines");

			}// Third inner class
		}

		public class TerminalThree {
			public void arabianFlights() {
				System.out.println("Terminal Two is for Delta Airlines");
			}
		}

	}


