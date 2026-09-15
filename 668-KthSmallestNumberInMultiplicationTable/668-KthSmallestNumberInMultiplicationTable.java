// Last updated: 9/15/2026, 10:54:52 PM
class Solution {
    public int findKthNumber(int m, int n, int k) {

        int low = 1;         // smallest possible answer
        int high = m * n;   // largest possible answer
        
        while(low < high){

            int mid = low+(high-low)/2;
            int count = 0;

        // Count numbers <= mid
            
            for(int i = 1; i<=m; i++){

                count += Math.min(mid/i, n);
           }

          // Not enough numbers -> answer bigger
             if(count < k){
                low = mid +1;
             }
             else{
                high = mid;
             }

        }
        return high;
    }
}