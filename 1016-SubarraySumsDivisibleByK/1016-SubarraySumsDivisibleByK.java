// Last updated: 8/23/2026, 11:01:04 PM
class Solution {
    public int subarraysDivByK(int[] nums, int k) {

    HashMap<Integer,Integer> ans = new HashMap<>();

    ans.put(0, 1); //Zero ek baar aa chuka h let's suppose

    int n = nums.length;
    int sum =0;
    int count  = 0;

    for(int i=0; i<n; i++){

        sum +=nums[i];  //pura sum 
        int rem = sum % k ;

        if(rem<0){  //agr sum m neg number aaye
          rem +=k;
        }

        count += ans.getOrDefault(rem, 0);

        ans.put(rem, ans.getOrDefault(rem, 0)+ 1);
    }
      return count;  
    }
}