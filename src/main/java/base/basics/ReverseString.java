package base.basics;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		reverseString(str);
	}
	
	public static void reverseString(String str) {
		String reverse = "";
		if (str.equals(reverse)) {
			System.out.println(reverse);
		}
		
		int length = str.length();
		int index = length-1;
		while (index>=0) {
			reverse = reverse+str.charAt(index);
			index--;
		}
		System.out.println(reverse);		
	}

}
