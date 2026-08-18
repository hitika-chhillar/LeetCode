// Last updated: 8/18/2026, 10:32:50 PM
class Solution {
    public int maximumSum(int[] arr) {

        int onedelete = Integer.MIN_VALUE;
        int nodelete = arr[0];
        int ans = arr[0];

        for(int i=1; i<arr.length; i++){

            int prevnodelete = nodelete;

          //kuch bhi delete nhi hua
        nodelete = Math.max(nodelete + arr[i], arr[i]); 

        //ek delete ho gaya

          if (onedelete == Integer.MIN_VALUE) {
                onedelete = prevnodelete;
            } else {
                onedelete = Math.max(onedelete + arr[i], prevnodelete);
            }
             ans = Math.max(ans, Math.max(nodelete, onedelete));
        }
        return ans;
    }
}