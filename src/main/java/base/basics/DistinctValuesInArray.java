package base.basics;

import java.util.Scanner;

public class DistinctValuesInArray {
	
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
		System.out.println("Array is sorted? " + countDistinct(array));
	}
	
	// Idea is to go back and compare with previous elements
	// if you go forward then you would have to compare with back
	// elements also along with forward elements
	// as we traverse if we compare with rear elements only we are good
	public static int countDistinct(int [] array) {
		int count = 0;
		for (int i=0;i<array.length;i++) {
			boolean isDistinct = true;
			for (int j=i-1;j>=0;j--) {
				if (array[i]==array[j]) {
					isDistinct = false; //moment it is not distinct break
					break;
				}
			}
			if(isDistinct) {
				count++;
			}
		}
		return count;
	}

}
