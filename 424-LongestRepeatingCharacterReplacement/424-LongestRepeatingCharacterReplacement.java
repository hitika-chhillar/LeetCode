// Last updated: 8/11/2026, 9:02:26 PM
class Solution {
    public int characterReplacement(String s, int k) {

        int [] freq = new int[26];   
        int left = 0;
        int res=0;
        int maxfreq = 0;

        for(int right = 0; right < s.length(); right++){

            // step 1: current char ko store kiya and uska count badhao
         freq[s.charAt(right) - 'A']++;

            // Step 2: update max
            maxfreq = Math.max(maxfreq, freq[s.charAt(right) - 'A']);

             // step 3: agar window invalid ho jaye → shrink
             while((right - left + 1) - maxfreq > k){
                freq[s.charAt(left) - 'A']--;
                left ++;
             }
             res = Math.max(res, right-left+1);

        }
        return res;
        
    }
}