package nestedClass;

public class LGA2 {// outer class
	// outer method
	public void welcome() {
		System.out.println("Welcome to LGA Airport");
	}// First inner class

	public class TerminalOne {

		public void destination() {

			System.out.println("Terminal One is for American Airlines");
		}// Second inner class

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

}
