package base.basics;

import java.util.Arrays;

public class RemoveElementFromArray {
	
	public static void main(String [] args) {
		// Given an array remove all occurrences of an
		// element from array and give a new length.
		int [] arr = {1,3,4,5};
		removeElem(arr, 4);
	}
	
	public static void removeElem(int [] arr, int val) {
		int i=0, j=0;
		
		while(i<arr.length) {
			if(arr[i] != val) {
				// does not match the val
				// keep it and move forward
				arr[j++] = arr[i];
			}
			i++; // Traverse the whole array.
		}
		
		Arrays.stream(arr).limit(j).forEach(System.out::println);
		System.out.println("New Array length: "+j);
	}

}
