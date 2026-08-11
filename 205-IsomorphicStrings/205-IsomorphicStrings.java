// Last updated: 8/11/2026, 9:02:34 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for(int i=0; i<s.length(); i++){

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(mapST[ch1] != mapTS[ch2]){
                return false;
            }

            mapST[ch1] = i + 1;
            mapTS[ch2] = i + 1;
        }
        

        return true;
    }
}