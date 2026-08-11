// Last updated: 8/11/2026, 9:02:24 PM
class Solution {
    public String frequencySort(String s) {
        
        //FREQUENCY COUNT 

        int[] freq = new int[128];
        for(char ch : s.toCharArray()){  //String ko char array me convert kiya
        freq[ch]++;
    }

    //CHARACTERS LIST

    Character[] arr = new Character[s.length()];
    for(int i=0; i<s.length(); i++){
       arr[i] = s.charAt(i);
    }

    //SORTING ACCORDING TO FREQUENCY

    Arrays.sort(arr, (a, b) -> {
        if(freq[b] != freq[a]){
            return freq[b] - freq[a];
        }
        else{
            return a-b;
        }
    });

    //BUILD ANSWER

    StringBuilder ans = new StringBuilder();
    for(char ch : arr){  //Array ke sare ch ko uthao and array m add kro
        ans.append(ch);
    }

    return ans.toString();
}
}