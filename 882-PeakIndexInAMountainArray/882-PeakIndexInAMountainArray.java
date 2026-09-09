// Last updated: 9/9/2026, 1:35:34 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
         int n = arr.length;
        int low = 0;
        int high = n-1;
      

        while(low < high){

            int mid = low + (high-low)/2;

            if(arr[mid] < arr[mid+1]){
              low = mid + 1;
            }
           
            else{
                high = mid;
          }
    }
    return high;
}
}

       