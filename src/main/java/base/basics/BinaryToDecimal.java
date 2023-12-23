package base.basics;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static void main(String [] args) {
		System.out.println("Please enter a number: ");
		Scanner scanner = new Scanner(System.in);
		//int number = scanner.nextInt();
		//System.out.println(convertToBinary(number));
		//System.out.println(1%10);
		//System.out.println(1/10);
		System.out.println(convertToBinary("101010"));
	}
	
	public static int convertToBinary(String binary) {
		int len = binary.length();
		int s = 0; int k = 1;
		for(int i=len-1;i>=0;i--) {
			s = (binary.charAt(i)-'0')*k+s; // actual number to be returned
			k = k*2; // place holder to use 2 pow n
		}
		return s;
	}
	
	
    public static int convertToBinary(int number) {
		
		// num=10
		// for each digit at the end num %10 find binary
	    // multiply that with 2 and add
    	int dec = 0;
    	int index = 0;
		while (number>0) {
			int remainder = number%10;
			int currentPosValue = (int)Math.pow(2, index);
			dec = currentPosValue*remainder + dec;
			number = number/10;
			index++;
		}
		
		return dec;
	}

}
