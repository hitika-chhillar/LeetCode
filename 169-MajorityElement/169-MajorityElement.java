// Last updated: 8/11/2026, 9:02:44 PM
//BOYER - MOORE ALGORITHM

class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        int majority = 0;

        for(int num: nums){

            if(count == 0){
                majority = num;
            }
            if( num == majority){
                count ++;
            }
            else{
                count --;
            }
        }
        return majority;
        
    }
}