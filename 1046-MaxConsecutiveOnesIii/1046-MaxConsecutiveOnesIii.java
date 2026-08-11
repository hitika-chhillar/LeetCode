// Last updated: 8/11/2026, 9:02:15 PM
class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeroscount= 0;
        int maxlen =0;

        for(int right=0; right<nums.length; right++){
           if(nums[right]== 0) zeroscount++;
           
           while(zeroscount >k){

               if(nums[left] == 0) zeroscount --;
                left++;
            }
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}