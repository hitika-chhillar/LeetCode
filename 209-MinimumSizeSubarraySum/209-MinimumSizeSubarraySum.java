// Last updated: 8/11/2026, 9:02:32 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left =0; //Window starting 
        int sum =0; //current window sum
        int minlen = Integer.MAX_VALUE; //minimum length of the subarray

        for(int right =0; right<nums.length; right++){
            sum +=nums[right];   // Adding new element 

            //Shrink the window(jb tk hiring hori h)

            while(sum >= target){
                minlen = Math.min(minlen, right - left + 1);

                sum -=nums[left];
                left++;
            }      
        }
        return (minlen == Integer.MAX_VALUE)?0:minlen;
    }
}