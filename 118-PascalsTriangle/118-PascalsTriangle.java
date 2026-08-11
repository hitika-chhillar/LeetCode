// Last updated: 8/11/2026, 9:02:52 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();

            long val = 1;  // first element always 1
            row.add(1);

            for(int j = 1; j <= i; j++){
                val = val * (i - j + 1) / j;
                row.add((int)val);
            }

            ans.add(row);
        }

        return ans;
    }
}