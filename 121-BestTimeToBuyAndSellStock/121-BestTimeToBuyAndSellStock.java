// Last updated: 8/11/2026, 9:02:50 PM
class Solution {
    public int maxProfit(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

               //Loop
        for(int price : prices){

            if(buyprice < price){ //profit
            int profit = price - buyprice; // Today's profit
            maxprofit = Math.max(maxprofit, profit);

            }
            else{
                buyprice = price;
            }
        }
            return maxprofit;
        }
}