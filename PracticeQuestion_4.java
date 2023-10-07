import java.util.HashMap;
import java.util.Map;

public class PracticeQuestion_4 {
	/*
	 * Prompt: Given an array of integers, nums, and a target, write
	 * 		an algorithm which return the indices of the two numbers
	 * 		in the array which add up to the target. You can assume
	 * 		that each input will have a single solution. Additionally
	 * 		you may not use the same element twice.
	 * 
	 * Example:
	 * 		INPUT: nums = [2,7,11,15], target=9
	 * 		OUTPUT: [0,1] (because nums[0] is 2, and nums[1] is 7 || nums[0] + nums[1] == 9)
	 */
	public int[] findUniqueSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (map.containsKey(nums[i]))
				return new int[] { map.get(nums[i]), i };
			else if (!map.containsKey(diff))
				map.put(diff, i);
		}
		return new int[] {};
	}
}
