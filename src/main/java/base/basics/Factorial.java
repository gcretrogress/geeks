package base.basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Please enter a number for factorial: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int factorial = 1, i=1;
        while(i<=n) {
            factorial = factorial*i;
            i++;
        }
        System.out.println("Factorial is: "+ factorial);
    }
}
