// Last updated: 8/11/2026, 9:02:47 PM
class Solution {
    public String reverseWords(String s) {

        int n = s.length();
        StringBuilder ans = new StringBuilder();

        String reversed = new StringBuilder(s).reverse().toString();

        for(int i =0; i<n; i++){

            StringBuilder word = new StringBuilder();

           while(i<n && reversed.charAt(i) != ' '){
                word.append(reversed.charAt(i)); 
                i++;

            }
            word.reverse();

            if(word.length() > 0){
                if(ans.length() > 0){
                    
                    ans.append(" ");

                }
                ans.append(word);

               
            }
        }
        return ans.toString();
        
    }
}