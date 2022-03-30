package lec18_string_manipulation;

public class UseOfString2 {
public static void main(String[] args) {
	String s1 = "My name is ismail. ";
	String s2 = "My name is ismail. ";
	String s3 = "my name is iyaad. ";
	String s4 = "MY NAME IS IYAAD. ";
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s4));
	System.out.println(s3.toUpperCase().equals(s4));
	System.out.println(s4.toLowerCase().equals(s3));
	System.out.println(s3.equals(s4)); // how that can be solved, second way below--
	System.out.println(s3.equalsIgnoreCase(s4));
	
	// The java string trim() method eliminates leading and trailing spaces. 
			// To avoid white space: trim() -- (remove any leading and trailing whitespace) 
			String s5 = "          whats Wrong.  ";
			System.out.println(s5);
			System.out.println("\nAfter trimming: " + s5.trim()); // Please see line 57 for solution of removing white space present between words
			


}
}
