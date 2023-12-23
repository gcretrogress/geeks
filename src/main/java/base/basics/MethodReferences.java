package base.basics;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {

	public static void main(String [] args) {
		List<Integer> l = Arrays.asList(10,20,30,40,50);
		
		l.stream().forEach(System.out::println); // A method reference replaces the lambda expression
		l.forEach(System.out::println); // forEach is part of Collection class a method from iterable interface
		
		l.forEach(MethodReferences::printValue);
		
		String [] a = {"GFG", "IDE", "Courses"};
		String [] b = {"gfg", "ide", "courses"};
		
		// Lambda expression
		// Arrays.equals(a, b, (a,b) -> String.compareToIgnoreCase(a,b))
		if(Arrays.equals(a, b, String::compareToIgnoreCase)) {
			System.out.println("yes");
		} else
			System.out.println("no");
	}
	
	public static void printValue(Integer x) {
		System.out.println(x);
	}
}
