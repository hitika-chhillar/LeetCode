// Last updated: 8/29/2026, 3:19:30 AM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] ans = new int[n];
        Stack <Integer> stack = new Stack<>();

        for(int i = n-1; i>=0; i--){

        while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
            stack.pop();
     }

           if(!stack.isEmpty()){
            ans[i] = stack.peek() - i;

            }
             else{
            ans[i] = 0;
           }
          
           stack.push(i);
        }
        return ans;
    }
}