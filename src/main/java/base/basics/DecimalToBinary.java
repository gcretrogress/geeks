package base.basics;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String [] args) {
		System.out.println("Please enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(convertToBinary(number));
		//System.out.println(1%10);
		//System.out.println(1/10);
	}
	
	public static String convertToBinary(int number) {
		
		// num=10
		// for each digit at the end num %10 find binary
		// 
		// Keep dividing the number by 2
		// 2 | num|remainder
		// 2 | 10 | 0
		// 2 | 5  | 1
		// 2 | 2  | 0
		// 2 | 1  | 0
		// 2 | 0  | STOP when num=0
		String s = "";
		while(number>0) {
			s = number%2+s;
			number = number/2;
		}
		return s;
	}

}
