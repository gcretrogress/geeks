package base.basics;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String [] args) {
		System.out.println("Please enter a string: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str) {
		if (str==null || str.length()==0) {
			return false;
		}
		
		int len = str.length();
		for (int i=0;i<len;i++) {
			// if you are at the middle or crossed over
			// there is nothing more to check
			int endPosition = len-1-i;
			int startPosition = i;
			if (startPosition==endPosition || startPosition>endPosition) {
				break;
			}
			// compare the current one with the last one
			if(str.charAt(i)!=str.charAt(len-1-i)) {
				return false;
			}
		}
		return true;
	}
}
