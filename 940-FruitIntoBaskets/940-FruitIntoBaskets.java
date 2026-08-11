// Last updated: 8/11/2026, 9:02:18 PM
class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer, Integer> ans = new HashMap<>();

        int left = 0;
        int max = 0;

        for(int right = 0 ; right< fruits.length; right++){

            ans.put(fruits[right], ans.getOrDefault(fruits[right], 0) + 1);

            // if size bada hua mtlb na hua 

            while(ans.size() > 2){

                ans.put(fruits[left], ans.get(fruits[left]) -1 );

                if(ans.get(fruits[left]) == 0){
                    ans.remove(fruits[left]);
                }
                left++ ;
            }
            //Update max

            max = Math.max(max, right - left + 1);
        }
        return max;
        
    }
}