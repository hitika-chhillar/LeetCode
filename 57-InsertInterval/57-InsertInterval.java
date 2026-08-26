// Last updated: 8/26/2026, 10:33:56 PM
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

    List<int[]> ans = new ArrayList<>();

    boolean insert = false;
    int n = intervals.length;

    for(int i=0; i<n; i++){

        // Curr interval phle h new baad m 

        if(intervals[i][1] < newInterval[0]){
            ans.add(intervals[i]);
        }

        // curr baad m hai aur new phle

        else if(intervals[i][0] > newInterval[1]){

            if(!insert){
                ans.add(newInterval);
                insert = true;
            }
                ans.add(intervals[i]);

            }

            //Overlap hai 

            else{

                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        

    }

    //Agr last tk insert na hua kisi m bhi toh 

    if(!insert){

        ans.add(newInterval);
    }

          return ans.toArray(new int[ans.size()][]);
        
    }
}