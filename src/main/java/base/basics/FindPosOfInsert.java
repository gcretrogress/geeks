package base.basics;

public class FindPosOfInsert {
	
	public static int binarySearch(int [] arr, int item) {
		
		// Given a sorted array go through the array and find
		// the position where the item is or where it can be inserted
		// This is classic binary search algorithm.
		
		// Maintain left and right variables that define the length of search
		// Find the portion where the item lies in the left portion or the right portion
		// keep dividing until you find it.
		
		// The order of growth would be O(log n) because we are taking log base 2 times
		// of depth search.
		
		int left = 0, right = arr.length - 1, mid, ans = -1;
		
		while ( left < right ) {
			
			// Find the mid point
			mid = left + ( right - 1 ) / 2;
			
			if ( arr[mid] == item ) {
				return mid;
			}
			
			if ( arr[mid] < item ) {
				// you need to focus on the right side,
				// move left to the right side 
				left = mid + 1;
				ans = mid + 1;
			} else {
				ans = mid;
				right = mid - 1;
			}
			
		}
		
		return ans;
	}
	
	public static void main(String [] args) {
		int [] arr = {1,2,3,4,7,9,10};		
		System.out.println(""+ binarySearch(arr, 5));
	}

}
