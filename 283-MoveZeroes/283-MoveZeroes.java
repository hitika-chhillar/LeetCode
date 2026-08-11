// Last updated: 8/11/2026, 9:02:27 PM
class Solution {
    public void moveZeroes(int[] nums) {

    
        int k=0;

        for( int i=0; i<nums.length; i++){

            if(nums[i] != 0){
                nums[k]=nums[i];
                k++;
            }
        }
        while(k<nums.length){
            nums[k]=0;
            k++;
        }
    }
}