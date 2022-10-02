class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length <= 1)
            return 0;
        
        int profit = 0;
        int minPrice = prices[0];
        
        for(int i = 1 ; i < prices.length ; i++){
            int currDayPrice = prices[i];
            
            if(currDayPrice >  minPrice){
                profit += currDayPrice - minPrice;
                minPrice = currDayPrice;
            }
            else{
                minPrice = currDayPrice;
            }
        }
        return profit;
    }
}