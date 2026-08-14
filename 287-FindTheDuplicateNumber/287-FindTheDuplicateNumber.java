// Last updated: 8/14/2026, 9:15:27 PM
class Solution {
    public int findDuplicate(int[] nums) {

        // Slow and Fast pointer method in array

        int slow = nums[0];
        int fast = nums[0];

       do{
        slow = nums[slow];
        fast = nums[nums[fast]];
       }
       while(slow != fast);

       slow = nums[0];

       while(slow != fast){

        slow = nums[slow];
        fast = nums[fast];
       }
       return slow;
    }
}