// Last updated: 8/19/2026, 9:51:10 PM
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int maxending = 0;
        int minending = 0;
        int maxsum = 0;
        int minsum = 0;

        for(int num : nums){

            maxending = Math.max(num, maxending + num);
           maxsum = Math.max(maxsum, maxending);

           minending = Math.min(num, minending + num);
           minsum = Math.min(minsum, minending); 
        }

        return Math.max(maxsum, Math.abs(minsum));
    }
}