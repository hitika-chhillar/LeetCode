// Last updated: 8/11/2026, 9:02:13 PM
class Solution {
    public int maxDepth(String s) {

        int currdepth =0;
        int maxdepth = 0;

        for(char ch : s.toCharArray()){

            if(ch == '('){
                 currdepth++;
                 maxdepth = Math.max(maxdepth, currdepth);
            }

            else if(ch== ')'){

                currdepth --;
            }
         
           
        }
        return maxdepth;
    }
}