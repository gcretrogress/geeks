package base.basics;

import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args) {
        // Given stairs you can skip maximum of one step
        // find the number of steps you can take
        // to reach to the top
        // Imagine three stairs: 1-3
        // One way is 1,2,3
        // Second way is 1,3 because you can skip
        // so you have two ways.
        // Similarly for four stairs
        // 1,2,3,4
        // 1,3,4
        // 2,3,4
        // Total of three ways.

        // This is an example of fibonacci numbers.
        System.out.println("Please enter a number for stairs: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        steps(n);
    }

    public static int steps(int n) {
        // no of ways to reach three stairs = 3
        // no of ways to reach four stairs = 5
        // no of ways to reach five stairs = no(3) + no(5) = 8
        if(n==0) {
            return 1;
        } else if(n==1) {
            return 1;
        } else {
            System.out.println(1+" ");
            System.out.println(1+" ");
            int a =1;
            int b =1;
            int c = 0;
            for (int i=2;i<n;i++) {
                c = a+b;
                System.out.println(c+" ");
                a = b; // by re-assigning you are keeping track of previous step
                b = c; // same here move forward to keep track of previous step
            }
            return c;
        }
    }
}
