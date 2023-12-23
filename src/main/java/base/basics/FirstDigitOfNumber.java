package base.basics;

import java.util.Scanner;

public class FirstDigitOfNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number for calculating first digit: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long start1 = System.currentTimeMillis();
        System.out.println(firstDigit(n));
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        System.out.println(f1(n));
        long end2 = System.currentTimeMillis();
        long start3 = System.currentTimeMillis();
        System.out.println(f2(n));
        long end3 = System.currentTimeMillis();
        
        System.out.println("First: "+(end1-start1));
        System.out.println("Second: "+(end2-start2));
        System.out.println("Third: "+(end3-start3));
    }

    /*
     * This is taking longer time.
     */
    public static int firstDigit(int n) {
        int m = Math.abs(n);

        if (m<10) {
            return m;
        } else {
            m = m / 10;
            return firstDigit(m);
        }
    }
    
    // Another solution
    // Very fast because no recursion involved
    public static int f1(int n) {
    	while(n>10) {
    		n = n/10;
    	}
    	return n;
    }
    
    // ANother way to solve this
    // log function and pow function of Math class
    // Same time as f2 using the Math functions.
    public static int f2(int n) {
    	double base = Math.log10(n);
    	int power = (int) base;
    	int divisor = (int) Math.pow(10, power);
    	int firstDigit = n/divisor;
    	return firstDigit;
    }
}
