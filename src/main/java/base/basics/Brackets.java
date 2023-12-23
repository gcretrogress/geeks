package base.basics;

import java.util.Map;
import java.util.*;
import java.util.Stack;

public class Brackets {

	public static void main(String [] args) {
		//isValid(")(");
		//System.out.println(isValid2("(){[}}]{"));
//		System.out.println(isValid("[()]){}("));
		System.out.println(isValid(")("));
	}

	public static boolean isValid2(String s ) {
		// If there are odd number of characters then it
		// is not valid
		if(s.length()%2 !=0) {
			return false;
		}

		// If it does not match return false
		Map<Character, Integer> bracketMap = new TreeMap<>();

		bracketMap.put('{', 0);
		bracketMap.put('}', 0);
		bracketMap.put('[', 0);
		bracketMap.put(']', 0);
		bracketMap.put('(', 0);
		bracketMap.put(')', 0);

		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);
			updateMap (bracketMap, ch, '{');
			updateMap (bracketMap, ch, '}');
			updateMap (bracketMap, ch, '[');
			updateMap (bracketMap, ch, ']');
			updateMap (bracketMap, ch, '(');
			updateMap (bracketMap, ch, ')');
		}
		
		if (bracketMap.get('{').intValue() != bracketMap.get('}').intValue()) {
			return false;
		} else if (bracketMap.get('(').intValue() != bracketMap.get(')').intValue()) {
			return false;
		} else if (bracketMap.get('[').intValue() != bracketMap.get(']').intValue()) {
			return false;
		} else {
			return true;
		}
	}
	
	private static void updateMap(
			Map<Character, Integer> bracketMap, 
			char ch,
			char processingChar) {
		int mapCount = 0;
		if (ch == processingChar) {
			mapCount = bracketMap.get('{');
			bracketMap.put('{', mapCount++);
		}
	}
	
	public static boolean isValid(String s) {
        
        // If there are odd number of characters then it
        // is not valid
        if(s.length()%2 !=0) {
            return false;
        }
        
        // '(', ')', '{', '}', '[' and ']'
        Stack<Character> stack = new Stack<>();
        
        System.out.println("Evaluating: "+s);
        
        for(int i=0;i<s.length();i++) {
        	Character chr = s.charAt(i);
        	if (chr=='(' || chr=='{' ||chr=='[') {
        		System.out.println("Pushing "+chr);
        		stack.push(chr);
        	} else if (chr==')' && !stack.isEmpty() && stack.peek() == '(') {
        		System.out.println("Popping "+'(');
        		stack.pop();
        	} else if (chr=='}' && !stack.isEmpty() && stack.peek() == '{') {
        		System.out.println("Popping "+'{');
        		stack.pop();
        	} else if (chr==']' && !stack.isEmpty() && stack.peek() == '[') {
        		System.out.println("Popping "+'[');
        		stack.pop();
        	} else {
        		System.out.println("returning false");
        		return false;
        	}
        }
        System.out.println("Stack empty "+stack.empty());
        return stack.empty();
    }
}
