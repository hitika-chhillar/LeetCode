// Last updated: 8/31/2026, 12:57:39 PM
class Solution {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];

    // Count frequency of each character also find index 
     for(char ch: s.toCharArray()){
        freq[ch - 'a']++;
     }

      // Find first character with frequency 1
      for(int i=0; i<s.length(); i++){

        if(freq[s.charAt(i) - 'a'] == 1){
            return i;
        }
      }
return -1;
        
    }
}