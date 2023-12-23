package base.basics;

public class StockProfit {
	
	public static void main(String [] args) {
		int [] arr = {7,1,5,3,6,4};
		
		System.out.println(profit(arr));
	}
	
	public static int profit(int [] num) {
		// Loop through once
		// start with min
		// find the diff which keeps growing
		int min = Integer.MAX_VALUE;
		int diff = 0;
		
		for(int i=0;i<num.length;i++) {
			
			int current = num[i];
			
			// Find the lowest value first
			if(current<min) {
				min = current;
				continue;
			}
			
			if(current - min>=diff) {
				diff = current - min;
			}
		}
		
		return diff;
	}

}
