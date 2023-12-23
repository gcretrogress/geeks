package base.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesInSortedArray {

	public static void main(String [] args) {
		int arr[] = {2, 2, 4, 5, 5};
		
		removeDup(arr);
	}

	public static void removeDup(int [] arr) {
		
		// Go through the array
		// compare the item on the left
		int left = arr[0];
		int right;
		int counter = 1;
		for(int i=1;i<arr.length;i++) {
			right = arr[i];
			if ( left == right) {
				// skip this
				continue;
			} else {
				// write that one to the available space
				arr[counter++] = right;
				left = right;
			}
		}
		
		System.out.println("Counter: "+counter);
		int [] newarr = new int[counter];
		for (int i=0;i<counter;i++) {
			newarr[i] = arr[i];
		}
		//Arrays.stream(newarr).forEach(System.out::println);
		Arrays.stream(arr).forEach(System.out::println);
	}
	
	
	public static void removeCommon(int[] arr) {
		// Result should be {2}
		List<Integer> coll = new ArrayList<>();
		coll.add(arr[0]);
		for (int i=1;i<arr.length;i++) {
			if (arr[i] != arr[i- 1]) {
				coll.add(arr[i]);
			}
		}
		System.out.println("Size="+coll.size());
		System.out.println("Items");
		coll.stream().forEach(System.out::println);

		System.out.println(2%3);
	}
}
