// Last updated: 8/19/2026, 10:40:32 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalsum = 0 ;

        int maxending  = 0;
        int minending = 0;

        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;

        for(int num : nums){

            totalsum +=num;

            maxending = Math.max(num, maxending + num);
            maxsum = Math.max(maxsum, maxending);

            minending  = Math.min(num, minending + num);
            minsum = Math.min(minsum, minending);
        }

        if(maxsum < 0){
            return maxsum;
        }
        return Math.max(maxsum, totalsum - minsum);
    }
}