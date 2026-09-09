// Last updated: 9/10/2026, 12:53:54 AM
class Solution {
    public int search(int[] nums, int target) {

       int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Part 1: left half sorted
            if (nums[mid] >= nums[0]) {

                if (nums[0] <= target && target < nums[mid]) {
                    high = mid - 1;
                } 
                else {
                    low = mid + 1;
                }
            }

            // Part 2: right half sorted
            else {

                if (nums[mid] < target && target <= nums[n - 1]) {
                    low = mid + 1;
                } 
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}