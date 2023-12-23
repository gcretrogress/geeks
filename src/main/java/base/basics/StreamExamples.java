package base.basics;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String [] args) {
		int [] arr = {10,20,30,40};
		
		int sum = Arrays.stream(arr)
		                .sum();
		
		System.out.println(sum);
		
		int max = Arrays.stream(arr)
				        .max() 
				        .getAsInt();
		
		System.out.println(max);
		
		double avg = Arrays.stream(arr)
				           .average()
				           .getAsDouble();
		
		System.out.println(avg);
		
		// Example of infinite stream but 
		// has terminal function and a limit function
		Stream.iterate(1, x->x+1)
		      .filter(x -> x.toString().contains("5"))
		      .limit(10)
		      .forEach(System.out::println);
		
		// Sort an array based on something
		String arr1[] = {"abc", "cde", "acd", "aec", "xyz"};
		
		Arrays.stream(arr1)
		      .filter(x->x.startsWith("a"))
		      .filter(x->x.endsWith("c"))
		      .sorted()
		      .forEach(System.out::println);
		
	}
	
	
}
