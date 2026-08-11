// Last updated: 8/11/2026, 9:02:09 PM
class Solution {
    public String largestOddNumber(String num) {

        int n = num.length();

        for(int i = n-1 ; i>=0; i--){

            char ch = num.charAt(i);

            //If it is ODD or not

            if((ch - '0') % 2 == 1){
             return num.substring(0, i+1);

            }
        }

        return "";
        
    }
}