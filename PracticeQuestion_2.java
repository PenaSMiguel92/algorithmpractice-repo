public class PracticeQuestion_2 {
	/*
	 * Prompt: Write an algorithm that rotates elements of an array to the right 
	 * by a given number of steps. 
	 * 
	 * For example: 
	 * Given the array [1, 2, 3, 4, 5] and 2 steps, the result should be [4, 5, 1, 2, 3].
	 * 
	 * Pseudocode:
	 * FUNCTION rotateArray(arr: ARRAY of INTEGERS, k: INTEGER) -> ARRAY of INTEGERS:
	 */
	public int[] rotateArray(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		if (k == 0)
			return arr;
		
		int[] temp = new int[k];
		for (int i = 0; i < k; i++) {
			temp[i] = arr[n - k + i];
		}

		for (int i = n - 1; i >= k; i--) {
			arr[i] = arr[i - k];
		}

		for (int i = 0; i < k; i++) {
			arr[i] = temp[i];
		}

		return arr;
	}
}
