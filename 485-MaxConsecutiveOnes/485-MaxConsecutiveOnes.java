// Last updated: 8/11/2026, 9:02:23 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxcon = 0;

        for( int i=0; i<nums.length; i++){

            if(nums[i] == 1){
                count ++;
                maxcon = Math.max(maxcon, count);

             }
             else{
                count =0;
             }
        }
        return maxcon;
        
    }
}