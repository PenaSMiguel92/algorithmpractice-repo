import java.util.Arrays;

public class PracticeQuestion_1 {
	/*
	 * Prompt: Given a array containing 'n' distinct numbers from a range of
	 * 		1 to n (1, 2, 3, ..., n) find the one missing number. 
	 * 
	 * Example:
	 * 		INPUT: [3,7,1,2,8,4,5]
	 * 		OUTPUT: 6
	 * 
	 * 		INPUT: [13,3,7,11,4,6,2,10,9,5,8,1]
	 * 		OUTPUT: 12
	 * 
	 */
	public int findMissingNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i + 1 != nums[i])
				return i + 1;
		}
		return -1;
	}
}
