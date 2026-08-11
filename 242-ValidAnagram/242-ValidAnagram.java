// Last updated: 8/11/2026, 9:02:29 PM
class Solution {
    public boolean isAnagram(String s, String t) {

         // IF LENGTH NOT EQUAL 

        if(s.length() != t.length())
        return false;

        // a to z lowercase only

        int[] count = new int[26];

         //COUNT CHARSSSS

        for(int i=0; i<s.length(); i++){

            
            count[s.charAt(i) - 'a'] ++;
            count[t.charAt(i) - 'a']--;
    
        }

        //CHECK IF ALL ARE ZEROS

        for(int num : count){
            if(num!= 0)
            return false;
        } 
        return true;       
    }
}