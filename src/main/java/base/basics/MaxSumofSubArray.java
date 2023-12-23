package base.basics;

public class MaxSumofSubArray {
	
	// Kadane's algorithm
	// O(log n)
	public static int sum(int [] arr) {
		 int max_sum = Integer.MIN_VALUE;
		 int cur=0;
		for (int i: arr) {
			if(cur<0) cur=0;
			cur += i;
			max_sum = Math.max(max_sum, cur);
		}
		return max_sum;
	}
	
	// Crude method divide and conquer
	// Binary search method. With recursive call
	// Doing the same thing as above and dividing the work more
	// O( n log n)
	public static int findSum(int [] arr) {
		return helper(arr, 0, arr.length-1);
	}
	
	public static int helper(int [] arr, int begin, int end) {
		if (begin==end) return arr[begin];
		int left_cross=Integer.MIN_VALUE, right_cross=Integer.MIN_VALUE;
		
		int mid= (begin+end)/2;
        int cur=0;
        
        for(int k=mid+1;k<=end;k++)
        {
            cur+= arr[k];
            right_cross= Math.max(right_cross,cur);
        }
        
        cur=0;
        for(int k=mid+1;k<=begin;k++)
        {
            cur+= arr[k];
            left_cross= Math.max(left_cross,cur);
        }
        
        int cross_sum=  left_cross + right_cross; 
        int left_sum = helper(arr,begin,mid);
        int right_sum = helper(arr,mid+1,end);
		
		return Math.max( cross_sum , Math.max(left_sum , right_sum) );
	}
	
	
	public static void main(String [] args) {
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(sum(arr));
	}

}
