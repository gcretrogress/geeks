
package base.basics;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
    	
        System.out.println("Please enter a number for lcm: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Please enter another number for lcm: ");
        int m = scanner.nextInt();
        scanner.close();
        
        int greatest = Math.max(m,n); 
        // 4 10 Answer should be 20, definitely less than 40
        int ans = 0;
        int multiple = 1;
        for(int i=1;i<greatest;i++) { //i= 1 9
            multiple = greatest * i; // multiple = 9 to 78
            // 9*1 9*2 9*3 9*4 etc
            if ( multiple%m == 0 && multiple%n == 0 ) {
                ans = multiple;
                break;
            }
        }
        System.out.println("LCM: " + ans);
    }
}
