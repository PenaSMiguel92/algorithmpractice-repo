public class PracticeQuestion_9 {
    /*
     * A peak element is an element that is strictly greater than its neighbors.
     * Given a 0-indexed integer array nums, find a peak element, and return its index. 
     * If the array contains multiple peaks, return the index to any of the peaks.
     * You may imagine that nums[-1] = nums[n] = -∞. 
     * In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
     * You must write an algorithm that runs in O(log n) time.
     * 
     * Example: 
     * Input: nums = [1,2,3,1]
     * Output: 2
     * 
     * Input: nums = [1,2,1,3,5,6,4]
     * Output: 5
     */

    public int findPeakElement(int[] nums) {
        return binarySearch(nums, 0, nums.length);
    }
    
    public int binarySearch(int[] nums, int left, int right) {
        if (left >= right)
            return left;

        int mid = left + (right - left) / 2;
        if (mid - 1 >= 0 && mid + 1 < nums.length) {
            int leftArea = binarySearch(nums, left, mid);
            int rightArea = binarySearch(nums, mid + 1, right);
            if (nums[leftArea] > nums[rightArea])
                return leftArea;
            else
                return rightArea;
        } else if (mid - 1 < 0 && mid + 1 < nums.length) {
            if (nums[mid] > nums[mid+1])
                return mid;
            else    
                return mid + 1;
        } else if (mid - 1 >= 0 && mid + 1 >= nums.length) {
            if (nums[mid] > nums[mid - 1])
                return mid;
            else
                return mid - 1;
        } else
            return mid;
    }
}
