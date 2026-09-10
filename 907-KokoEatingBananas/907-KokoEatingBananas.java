// Last updated: 9/11/2026, 1:12:51 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1;
        int high = findMax(piles);

        while(low < high){
        
        int mid = low +(high - low)/2;

        if(canFinish(piles,h,mid)){
            high = mid; //Try smaller speed
        }
        else{
            low = mid+1; //Try higher one
        }
        }
        return low;
          
        }
        // HEALPER FUNCTION
        private int findMax(int[] piles){
            int max = piles[0];

            for(int bananas : piles){
                max = Math.max(max,bananas);
            }
            return max;
        }
        //KR PAYEGI ITNE HRS M KHTM YA NHI

        private boolean canFinish(int[] piles, int h, int k){
            long hours = 0;
            
            for(int bananas:piles){

                hours += (bananas + k - 1)/k; // ceil(bananas / k)
            }
            return hours <= h ;

    }
}