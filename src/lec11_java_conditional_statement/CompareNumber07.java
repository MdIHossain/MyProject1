package lec11_java_conditional_statement;

public class CompareNumber07 {

	public static void main(String[] args) {
		int val1 =45;
		int val2 = 40;
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
