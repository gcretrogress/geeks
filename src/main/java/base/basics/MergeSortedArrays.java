package base.basics;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int [] arr1 = {61,72,83};
        int [] arr2 = {1,1,11,15};

        int n = arr1.length;
        int m = arr2.length;
        
        int [] arr3 = new int[n+m]; // Create a new array that has the sum of both lengths
        
        int i = 0, j = 0, k =0; // Create pointers to move in each array
        
        while (i<n && j<m) { // condition either list has reached the limit
        	if(arr1[i]<arr2[j]) {
        		arr3[k++] = arr1[i++];
        	} else {
        		arr3[k++] = arr2[j++];
        	}
        }
        
        // Now whatever is left over add
        // one of the while loops will be tested.
        while(i<n) {
        	arr3[k++] = arr1[i++];
        }
        
        while(j<m) {
        	arr3[k++] = arr2[j++];
        }
        
        for(int s: arr3) {
        	System.out.println(s);
        }
    }

}
