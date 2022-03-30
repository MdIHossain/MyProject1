package lec11_java_conditional_statement;

public class Use_of_java_for_loop {
	public static void main(String[] args) {
		System.out.println("\n-------------- for loop 01 --------------\n");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("\n-------------- for loop 02 --------------\n");
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("\n-------------- for loop 03 --------------\n");
		for (int i = -5; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("\n-------------- for loop 04 --------------\n");
		for (int i = 4; i <= 10; i += 3) {
			System.out.println(i);
		}
		System.out.println("\n-------------- for loop 05 --------------\n");
		int j = 2;
		for (int i = 5; i <= 10; i += 4) {
			System.out.println(" The valu are " + i * j);
		}
		System.out.println("\n-------------- for loop 06 --------------\n");
		int k = 5;
		for (int i = 4; i <= 15; i += 5) {
			System.out.println("The value are " + i * k);
		}
		System.out.println("\n-------------- for loop 07 --------------\n");
		int l = 3;
		for (int i = 5; i <= 12; i += 6) {
			System.out.println("The valu are " + (l + i));
		}
		// decremental block
		System.out.println("\n-------------- for loop 09 --------------\n");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("\n-------------- for loop 10 --------------\n");
		int m = 2;
		for (int i = 18; i >= 10; i = i - 3) {
			System.out.println("The value are " + (i + m));
		}
		// as condition false nothing will execute or print
		System.out.println("\n-------------- for loop 11 --------------\n");
		for (int i = 20; i < 10; i -= 2) {
			System.out.println(i);
			//check
			System.out.println("***********");
		}l=2;
		for(int i =25;i>10;i-=3) {
			
		System.out.println(i/l);
		}
		
	}

}
