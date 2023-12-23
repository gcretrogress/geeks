package base.basics;

import java.util.Scanner;

public class LongestPalindromeSubstring {
	
	public static void main(String [] args) {
		
//		Scanner s = new Scanner(System.in);
//		String str = s.next();
		
		System.out.println(longestSubstring("abba"));	
	}
	
	public static String longestSubstring(String str) {
		if ( str == null || str.length() < 1) {
			System.out.println("");
		}
		
		
		int start = 0;
		int end = 0;
		
		for (int i=0;i<str.length();i++) {
			// Two cases
			
			// 1. racecar
			int len1 = expandMiddle(str, i, i);

			// 2. abba 
			int len2 = expandMiddle(str, i, i+1);
			
			int len = Math.max(len1, len2);
			
			if ( len > end - start ) {
				start = i - ((len-1) /2);
				end = i + (len/2);
			}
		}
		
		return str.substring(start, end + 1);
	}
	
	public static int expandMiddle(String s, int left, int right) {
		
		if (s == null || left>right) return 0;
		
		// abba left -1 right - 2 keep expanding
		// so the left decreases right increases
		while (left >=0 &&
				right < s.length() &&
				s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		
		return right - left - 1;
		
	}

	// abba
	
	// Brute force way find all substrings
	// a
	// ab
	// abba
	
	// b bb bba
	
	// a Then another function to check if that is palindrome, could be three inner loops
	
	// Complexity is O(n^3)
}
