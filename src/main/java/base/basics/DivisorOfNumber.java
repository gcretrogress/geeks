package base.basics;

import java.util.Scanner;

public class DivisorOfNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number for divisor: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // if n = 15
        // print 1 3 5 15
//        int i = 1;
//        while (i<=n/2) {
//            if ( n % i == 0) {
//                System.out.print(i+" ");
//            }
//            i++;
//        }
//        System.out.print(n);

        // Another faster solution
        // 30 = 5x6 always a pair of divisors
        // one of them is smaller or equal to the other
        // x X y = n or x X x = n
        // so x <= square root of n
        printDivisors(n);
    }

    // O(squareroot of n) complexity of time and 1 for space.
    public static void printDivisors(int n) {
        int i;
        for ( i=1; i*i < n; i++) {
            if (n%i == 0) {
                System.out.println(i);
            }
        }
        for(;i>1;i--) {
            if (n%i == 0) {
                System.out.println(n/i);
            }
        }
    }
}
