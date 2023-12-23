package base.basics;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Please enter a number for gcd: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Please enter another number for gcd: ");
        int m = scanner.nextInt();


        // Find smallest between two numbers that way all its factors will be common
        // Find a factor that divides both of them keep finding the max of that.
        // This is better because you are iterating only once
        int smallest = Math.min(m,n);
        int gcd = 1;
        for(int i=1;i<=smallest;i++) {
            if (m%i ==0 && n%i == 0) {
                gcd = i;
            }
        }
        System.out.println("Greatest common factor: " + gcd);
    }

    public static String findFactors(int n) {
        int i=1;
        StringBuilder factors = new StringBuilder();
        while (i<=n) {
            if (n%i==0) {
                factors.append(i);
            }
            i++;
        }
        System.out.println("Factors of: " + n + ", are: "+factors.toString());
        return factors.toString();
    }
}
