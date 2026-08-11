// Last updated: 8/11/2026, 9:02:48 PM
class Solution {
    public int singleNumber(int[] nums) {

        int n=nums.length;
        int xor = 0;
          for(int i=0; i<=n-1; i++){

            xor^=nums[i];
          }
          return xor;

        
    }
}