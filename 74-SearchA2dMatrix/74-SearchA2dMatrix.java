// Last updated: 9/12/2026, 10:55:22 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length; // M IS ROWS
        int n = matrix[0].length; // N IS COLUMNS

        int low = 0;
        int high = m*n - 1;

        while(low <= high){

            int mid = low + (high - low)/2;
            int row = mid/n;
            int col = mid % n;
             
             if(matrix[row][col] == target){
                return true;
             }
             else if(matrix[row][col] < target){
                 low = mid+1;
             }
             else{
                high = mid-1;
             }
        }
        return false;
    }
}