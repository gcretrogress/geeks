package base.basics.base;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String [] args) {
		System.out.println("Please enter a number for calculating first digit: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        n = Math.abs(n);
        // prime factors example, if not prime do not consider it
        // 50 = 2 5 5
        // 100 = 2 2 5 5
        // if 2 is repeated we need to print it
        primeFactors(n);
        
	}
	
	public static void primeFactors(int n) {
		if (n==2) {
			return;
		}
		
		int i=2, x;
		for(i=2;i<n;i++) {
			if(isPrime(i)) {
				x=i;
				while (n%x==0) {
					System.out.print(i);
					x = x*i;
				}
			}			
		}
	}
	
	public static boolean isPrime(int n) {
		n = Math.abs(n);
		
		if (n==0 || n ==1) {
			return false;
		} 
		
		if(n==2 || n==3) {
			return true;
		}

		if (n%2==0 || n%3 == 0) {
			return false;
		}
		
		// we eliminated 1,2,3,4 from above
		// starting from 5, we need to only look at
		// 5 7 11 13 .. notice each is separated by 2
		for (int i=5;i*i<=n;i=i+6) {
			if (n % i == 0 || n%(i+2) == 0) {
				return false;
			}
		}
					
		return true;
	}
	
	
	
	public static String findFactors(int n) {
		StringBuilder str = new StringBuilder();
		int forwardIndex = 2;
		for(forwardIndex=2;forwardIndex*forwardIndex<=n;forwardIndex++) {
			if (n%forwardIndex==0) {
				str.append(forwardIndex+" ");
			}
		}
		System.out.println("i: "+forwardIndex);
		int reverseIndex=0;
		for(reverseIndex=forwardIndex;reverseIndex>1;reverseIndex--) {
			if (n%reverseIndex==0) { // in order to get the highest value in sequence
				str.append(n/reverseIndex+" ");
			}
		}
		//str.append(n); If we do not want the number itself
		return str.toString();
	}
}
