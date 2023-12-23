package base.basics;

public class ArrayOperations {
	
	public static void removeDuplicates(int [] arr) {
		// Remove duplicates from sorted Array.
		// You could use extra array and copy unique items there
		// however a better approach is one pass through avoid duplicates
		
		
		// Idea here is compare the current item with previous item
		// if they do not match replace position you are evaluating with current index
		int res = 1;
		for(int i=1;i<arr.length;i++) {
			if (arr[i] != arr[res-1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		printArray(arr);
	}
   
   // Simpler approach using while loop
   public static int[] reverseArrayWithWhileLoop(int  [] arr) {
		
		int low=0;
		int high=arr.length-1;
		int temp = 0;
		
		while (low<high) {
			temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			low++;
			high--;
		}
		
		return arr;
	}
	
	public static int[] reverseArrayWithForLoop(int  [] arr) {
		
		int firstIndex =0;
		int lastIndex = arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			
			firstIndex = i;
			lastIndex = arr.length-1-i;
			
			if(lastIndex<=firstIndex) {
				break;
			}
			
			int firstItem = arr[firstIndex];
			int lastItem = arr[lastIndex];
			
			arr[lastIndex] = firstItem;
			arr[firstIndex] = lastItem;
			
		}
		
		return arr;
	}
	
	public static int findSecondLargestElement(int [] arr) {
		
		int largest = arr[0];
		int secondLargest = arr[0]-1;
		int secondLargestIndex = -1;
		
		for(int i=0; i<arr.length-1;i++) {
			if (arr[i] >= largest) {
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
				secondLargestIndex = i;
			}
		}
		
		return secondLargestIndex;
	}
	
	
	public static void main(String [] args) {
		//int [] arr = {3,5,3,4,20,4,4,4};
		//int [] arr = {10,10,10};
		int [] arr = {10,20,20,30,30,30,30};
		
		int largestElement = findLargestElement(arr) ;
		
		// Big O of n
		//System.out.println("Largest item in array: " + largestElement);
		
		// Big O of n
		//System.out.println("Is array sorted: " + isSorted(arr));
		
		// Big O of n
		//System.out.println("Second largest index: " + findSecondLargestElement(arr));
		
		// Big O of n
		//System.out.println("Reverse array: ");
		//printArray(reverseArrayWithWhileLoop(arr));
		
		removeDuplicates(arr);
	}
	
	public static void printArray(int [] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	public static int findLargestElement(int [] arr) {
		int item = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if (item < arr[i]) {
				item = arr[i];
			}
		}
		
		return item;
	}
	
	public static boolean isSorted(int [] arr) {
		for (int i=0;i<arr.length-1;i++) {
			if (arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	

}
