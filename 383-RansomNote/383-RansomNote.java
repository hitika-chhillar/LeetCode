// Last updated: 8/31/2026, 1:28:21 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int [] freq = new int[26];

           // Count frequency of characters in magazine
           for(char ch : magazine.toCharArray()){
            freq[ch - 'a']++;
           }

            // Use characters for ransomNote
            for(char ch : ransomNote.toCharArray()){

                if(freq[ch - 'a'] == 0){
                    return false;
                }
                freq[ch - 'a']--;
            }
            return true;
        
    }
}