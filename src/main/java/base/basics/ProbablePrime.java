package base.basics;

import java.math.BigInteger;
import java.util.Scanner;

public class ProbablePrime {

	public static void main(String [] args) {
		System.out.println("Please enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println(isPrimeNumber(num));
		System.out.println(nextPrimeNumber(num));
	}
	
	private static boolean isPrimeNumber(int num) {
		BigInteger b = new BigInteger(num+"");
		return b.isProbablePrime(1); // certainity as parameter
	}
	
	private static String nextPrimeNumber(int num) {
		BigInteger b = new BigInteger(num+"");
		return b.nextProbablePrime().toString();
	}
}
