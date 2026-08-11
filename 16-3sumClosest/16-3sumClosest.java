// Last updated: 8/11/2026, 9:02:59 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
      Arrays.sort(nums); //1 : Sort the array

      int n = nums.length;

      int closest = nums[0] + nums[1] + nums[2]; // 2: best sum for starting 

      for(int i=0; i<n-2; i++){

       int j = i+1;
       int h = n-1;

       while(j < h){

        int sum = nums[i] + nums[j] + nums[h];

        // Update closest

        if(Math.abs(sum-target) < Math.abs(closest-target)){
            closest = sum;
        }
        //Move pointers

        if(sum<target){
            j++;
        }
        else if(sum>target){
            h--;
        }
        else{
            return sum; //exact match 
        }
       }
      }
      return closest;
        
    }
}