package base.basics;

import java.util.Scanner;

public class ArraySorted {
	
	public static void main(String [] args) {
		System.out.println("Please enter size of array: " + "\n");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int [] array = new int [length];
		for (int i=0;i<length;i++) {
			System.out.println("Enter a new number for arrary: " + "\n");
			array[i] = scanner.nextInt();
		}
		// send the array to see if it is sorted
		System.out.println("Array is sorted? " + isSorted(array));
	}
	
	public static boolean isSorted(int [] array) {
		for (int i=0;i <array.length-1;i++) {
			if(array[i]>array[i+1] ) {
				return false;
			}
		}
		return true;
	}

}
