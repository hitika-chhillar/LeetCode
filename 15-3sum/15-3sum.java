// Last updated: 8/11/2026, 9:03:00 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
          
          Arrays.sort(nums);  // SORT ARRAY
          int n = nums.length;

          for(int i=0; i<n; i++){  //FOR ITERATION FIXED ONE

            if(i>0 && nums[i] == nums[i-1]) //check duplicates in i
            continue ;
             int j = i+1;
             int k = n-1;

             while(j<k){

                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                    while(j<k && nums[j]== nums[j-1]) //AVOID SAME
                    j++;

                    while(j<k && nums[k] == nums[k+1])
                    k--;
                }
                else if(sum< 0){
                    j++;      //NEED BIGGER SUM
                }
                else{
                    k--;      //NEED SMALLER SUM
                }

             }
          }
        
        return ans;
    }
}