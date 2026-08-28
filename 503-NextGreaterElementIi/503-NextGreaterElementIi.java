// Last updated: 8/28/2026, 6:46:56 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack <Integer> stack  = new Stack<>();

         // Traverse twice because array is circular

         for( int i = 2*n-1; i>= 0; i--){
               int index = i % n; //index 4,5,6

               while(!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
               }

               if(i<n){

                if(!stack.isEmpty()){
                    ans[index] = stack.peek();
                }
               }
               stack.push(nums[index]);
         }
        return ans;
    }
}