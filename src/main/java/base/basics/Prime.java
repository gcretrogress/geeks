package base.basics;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Please enter a number for prime: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Divisors always appear in pairs
        System.out.println("Is prime : " + isPrime(n));
    }

    public static boolean isPrime(int n) {
        if(n==1) {
            System.out.println("1 is not prime");
            return false;
        }

        if(n==2 || n==3) {
            System.out.println("2,3 are prime");
            return true;
        }

        if (n%2==0||n%3==0) {
            return false;
        }

        int i=1;
        // We can skip all multiples of 2 and 3, so increment 5 to 11
        // only need to check divisible by 5, 7, 11, 17...
        // we are making it efficient by skipping so many iterations
        for (i=5;i*i<=n;i=i+6) {
            if (n%i == 0 || n%(i+2) == 0) {
                System.out.println("Divisible by "+i+", not a prime");
                return false;
            }
        }

        System.out.println("It is prime");
        return true;
    }
}
