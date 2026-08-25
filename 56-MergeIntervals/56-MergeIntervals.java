// Last updated: 8/26/2026, 1:02:05 AM
class Solution {
    public int[][] merge(int[][] intervals) {

        // Sort intervals based on start time
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();

        for(int[] interval : intervals){

         // if list is empty and no overlap
            if(ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0]){
                ans.add(interval);
            }
            else{
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
            }
        } 
        return ans.toArray(new int [ans.size()][]);
     }
}