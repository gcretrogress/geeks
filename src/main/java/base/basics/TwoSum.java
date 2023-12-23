package base.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoSum {
	
	public static void main(String [] args) {
		int [] nums = {2,7,11,15};
		int target = 9;
		int [] ans = {2, 7};
		System.out.println(sumArry(nums, target));
	}
	
	public static List<Integer> sumArry(int [] nums, int target) {
		// Go through once
		// Keep a diff for each, if that diff matches
		Map<Integer, Integer> count = new HashMap<>();
		List<Integer> answers = new ArrayList<>();
		
		for(int i=0;i<nums.length;i++) {
			
			int currentArrItem = nums[i];
			int diff = target - currentArrItem;
			
			Set<Integer> diffs = count.keySet();
			
			if (diffs.contains(currentArrItem)) {
				answers.add(diff);
				answers.add(currentArrItem);				
				break;
			}
			
			count.put(diff, currentArrItem);
			
		}
		return answers;
	}

}
