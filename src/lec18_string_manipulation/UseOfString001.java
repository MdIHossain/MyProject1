package lec18_string_manipulation;

public class UseOfString001 {

	public static void main(String[] args) {
		String s ="of how to interpret the past and sometimes write to Provide lessons for their own society. ";
		System.out.println("\n ------------------------------------------------------------------------\n");
		// The Java String class length() method finds the length of a string.
		System.out.println(s + "\n");
		System.out.println("The length of the String is: "+ s.length());
		System.out.println(s + "\n");
		// The java string toUpperCase() method returns the string in uppercase letter.
		System.out.println(s.toUpperCase());
		System.out.println(s + "\n");
		System.out.println(s.toLowerCase());
		// charAt() -- Returns the char value at the specified index.
				// The index number starts from 0 and goes to n-1, where n is the length of the
				// string.
		System.out.println(s + "\n");
		System.out.println("\nThe character at a specific position(0): " + s.charAt(3));
		System.out.println("\nThe character at a specific position(10): " + s.charAt(5));
		
		System.out.println("\n ------------------------------------------------------------------------");
		System.out.println("\nThe character 'W' is, at the position of: " + s.indexOf('w'));
		System.out.println("\nThe character 'S' is, at the position of: " + s.indexOf('S'));
		// Returns the index within this string of the first occurrence of the specified
				// substring.
		System.out.println(s + "\n");
		System.out.println("\nThe index of 'write' word is: " + s.indexOf("write"));
		System.out.println("\nThe index of 'write' word is: " + s.indexOf("write"));
		System.out.println(s +"\n");
		System.out.println("\nThe first 'i' character is - at the position of: " + s.indexOf('i')); // (2)
		System.out.println("\n The second 'r' character is - at the position of: " + s.indexOf('r', s.indexOf('r') + 1));
		
	}

}
