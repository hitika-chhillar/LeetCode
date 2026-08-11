// Last updated: 8/11/2026, 9:02:53 PM
class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";


        int [] freq = new int [256]; //ASCII VALUE 
        for(char c : t.toCharArray()){ //frq add hogi har t ke character ki
            freq[c]++;
        }


        int left =0;
        int right = 0;
        int start = 0;
        int minlen = Integer.MAX_VALUE;
        int count = t.length(); //Count krega kitne taget required h 



        while(right < s.length()){

            if(freq[s.charAt(right)] > 0){
                count--; //useful character mila then ek character km ho gaya..
            }

            freq[s.charAt(right)]--; //include in window
            right++;


            //valid ans mila

            while(count == 0){

               //answer update
               if(right - left < minlen){
                minlen = right - left;
                start = left;
               }


               //Shrink window

               freq[s.charAt(left)]++;

               if(freq[s.charAt(left)] > 0){
                count++; //window invalid ho gaya mtlb valid character nikl gaya
               }
               left++;
            }
        }
          return minlen == Integer.MAX_VALUE? "":s.substring(start, start + minlen);
        
    }
}