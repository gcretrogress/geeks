package base.basics;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntFibbonacci {
	
	public static void main(String [] args) {
		System.out.println("Please enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
//		System.out.println(getFactorial(num).toString());
		System.out.println(getFibonacci(num));
	}

	private static BigInteger getFactorial(int num) {
		// TODO Auto-generated method stub
		
		if(num<2) {
			return new BigInteger(num+"");
		}
		
		BigInteger big = new BigInteger("1");
		
		for (int i=2;i<=num;i++) {
			BigInteger b = new BigInteger(i+"");
			big = big.multiply(b);
		}
		
		return big;
	}
	
	private static String getFibonacci(int num) {
		
		BigInteger a = new BigInteger(0+"");
		BigInteger b = new BigInteger(1+"");
		BigInteger c = new BigInteger(1+"");
		
		// a = 0, b = 1, c = 1, next = c + b
		StringBuilder str = new StringBuilder();
		str.append(a + " ");
		str.append(b + " ");
		for(int j=2;j<num;j++) {
			c = a.add(b);
			str.append(c + " ");
			a = b;
			b = c;
		}
		
		return str.toString();
	}

}
