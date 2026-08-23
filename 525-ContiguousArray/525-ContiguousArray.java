// Last updated: 8/24/2026, 12:01:28 AM
class Solution {
    public int findMaxLength(int[] nums) {

        HashMap <Integer,Integer> ans = new HashMap<>();
        ans.put(0,-1);

        int sum =0;
        int maxlen =0;

        for(int i=0; i<nums.length; i++){

            if(nums[i] == 0){
                sum -= 1;
            }
            else{
                sum +=1;
            }
            if(ans.containsKey(sum)){

                maxlen = Math.max(maxlen, i- ans.get(sum));
            }
            else{
                ans.put(sum,i);
            }
        }
        return maxlen;   
    }
}