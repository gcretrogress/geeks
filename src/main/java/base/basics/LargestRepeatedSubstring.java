package base.basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LargestRepeatedSubstring {
	
	public static void main(String [] args) {
		System.out.println(longestSubString("abcabcde"));
	}
	
	public static int longestSubString(String input) {
		
		// Idea is here a map contains each key and the position where it was found
		// as soon as a matching char is found we update the position
		// next a substring value is maintained where we try to keep get it 
		// by using max value
		
		Map<Character, Integer> map = new HashMap<>();
		
		int finalResult = 0;
		
		for(int i=0,j=0;j<input.length();j++) {
			
			if(map.containsKey(input.charAt(j))) {
				i = Math.max( i, map.get(input.charAt(j)) );
			}
			
			finalResult = Math.max(finalResult, j-i+1);
			map.put(input.charAt(j), j+1);
		}
		
		return finalResult;
	}
	public static int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;

        int i =0, j = 0, max = 0;
        java.util.Set<Character> charSet = new java.util.HashSet<>();
        while(i < s.length()) {
            char c = s.charAt(i);
            while(charSet.contains(c)) {
                charSet.remove(s.charAt(j));
                ++j;
            }
            charSet.add(s.charAt(i));
            max = Math.max(max, i - j + 1);            
            ++i;            
        }
        
        return max;
    }
	
	public static int sub(String name) {
		
		// name = abcabcabcde
		// answer should be abc
		int len = name.length();
		
		// Go through the string start incrementing substr length
		// as soon as you find a matching char move the pointer right
		int max = 0, j = 0;
		Set<Character> charSet = new HashSet<>();
		
		for(int i=0;i<len;i++) {
			
			char ch = name.charAt(i);
			
			while(charSet.contains(ch)) {
				charSet.remove(name.charAt(j));
				j++;
			}
			
			charSet.add(ch);
			max = Math.max(max, i-j+1);
			
		}
		
		return max;
		
	}

}
