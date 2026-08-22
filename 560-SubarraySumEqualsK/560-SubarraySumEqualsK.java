// Last updated: 8/22/2026, 5:16:23 PM
class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> ans = new HashMap<>();
        ans.put(0,1); //0 EK baar aa chuka h

        int prefixsum = 0;
        int count  = 0;

        for(int num: nums){
         prefixsum +=num;

         if(ans.containsKey(prefixsum - k)){;
         count += ans.get(prefixsum - k);
         }
            ans.put(prefixsum, ans.getOrDefault(prefixsum, 0)+ 1);
        }

        return count;
    }
}