// Last updated: 8/11/2026, 9:02:20 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int sum =0;

         // Current & maxsum nikala hai

        for(int i=0; i<k; i++){

            sum += nums[i];
        }
        int maxsum = sum;

        // Slide the window krenge
        for(int i=k; i<n; i++){

            sum +=nums[i]; //New sum
            sum -= nums[i-k]; // remove old index element 

            maxsum = Math.max(maxsum, sum);
        }
        //Average = sum/k;

        return (double)maxsum/k;
        
    }
}