package lec09_java_different_0f_class;

import java.util.Random;

public class Use_of_random_class {

	public static void main(String[] args) {
		System.out.println("----------use of nextInt without limit (int type)--------------");
		Random random = new Random();
		int a = random.nextInt();
		int b = random.nextInt();
		System.out.println("Randomly chosen number 1:"+a);
		System.out.println("Randomly chosen number 2:"+b);
		System.out.println("Randomly chosen number 3:"+random.nextInt());
		System.out.println("\n-------Use of nextInt with limit--------");
		int c = random.nextInt(100);
		int d = random.nextInt(100);
		System.out.println("Randomly chosen number 4:" +c);
		System.out.println("Randomly chosen number 5:"+d);
		System.out.println("Randomly chosen number 6:"+random.nextInt(200));
		System.out.println("\n--------------- Use of nextBoolean------------------");
		boolean e = random.nextBoolean();
		boolean f = random.nextBoolean();
		System.out.println("Random Boolean value 1 : " + e);
		System.out.println("Random Boolean value 2 : " + f);
		System.out.println("Random Boolean value 3 : " + random.nextBoolean());
		
		

	}

}
