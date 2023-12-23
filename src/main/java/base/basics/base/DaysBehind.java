package base.basics.base;

public class DaysBehind {
	
	/**
	 * Given two integer d and n. Where d is the day, out of 7 days of week, d varies from 0 to 6 as shown below.

0 - Sunday

1 - Monday

2 - Tuesday

3 - Wednesday

4 - Thursday

5 - Friday

6 - Saturday

Complete the function utility() with d and n as parameters. Print index for the day which is n days before the given day d.
	 */
	
	/**
	 * STUPID THING WANTS print not println
	 * @param d
	 * @param n
	 */
	public static void utility(int d, int n){
	    //write your code here
	    int weekBehind = n%7;
	    int daysBehind = d - weekBehind;
	    if (daysBehind<0) {
	        System.out.print(7 + daysBehind);
	    } else {
	        System.out.print(daysBehind);
	    }
	}
	
	public static void countDigits(int n){

	    int div = 0;
	    do {
	        n = n / 10;
	        div++;
	    } while (n>0);
	    
	    System.out.print(div);

	}
	
	public static void square(int n){
	    //Complete the code given below
	    for(int i=0;i<n;i++){
	        if( i==0  ){
	        for(int j=0;j<n;j++)
	           System.out.print("* ")  ;   
	            
	        }
	        else if( i < (n-1)  ){
	           System.out.print("* ");
	           for(int j=1;j<n-1;j++) {
	               System.out.print("  ");
	           }
	           //if(n%2==0)
	        	   System.out.print("*") ;
	           //else
	        	//   System.out.print("*") ;
	        }
	        else{
	           for(int j=0;j<n;j++)
	           System.out.print("* ") ;    
	        }
	         System.out.println();  
	    }
	}
	
	public static int nFactorial(int n){
	    int ans = 1;
	    
	    if(n>0) {
	        do {
	            ans = ans*n;
	            n = n - 1;
	        } while (n>0);
	    }
	    
	    return ans;
	}
	
	public static void main(String [] args) {
		square(3);
	}

}
