// Last updated: 9/7/2026, 12:29:52 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = findfirst(nums,target);
        int last = findlast(nums,target);
       return new int[]{first,last};
    }
 
     public int findfirst (int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res = -1;

        while(low <= high){

            int mid = low+(high-low)/2;

            if(nums[mid]<target){
                low = mid+1;
            }
           else if(nums[mid]>target) {
                high = mid-1;
            }
            else{
                res = mid; // ye yaad rakh liya thk h ok
                high = mid - 1; // but piche dekhungi first kahi aur toh nhi h 
            }
        }
        return res;
    }

    public int findlast (int[] nums, int target) {
        
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res = -1;

        while(low <= high){

            int mid = low+(high-low)/2;

            if(nums[mid]<target){
                low = mid+1;
            }
           else if(nums[mid]>target) {
                high = mid-1;
            }
            else{
                res = mid; // ye yaad rakh liya thk h ok
               low = mid + 1; // but aage dekhungi first kahi aur toh nhi h 
            }
        }
        return res;
    }
}