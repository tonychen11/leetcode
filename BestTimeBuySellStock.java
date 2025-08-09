class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        int sell; 

        for(int i = 1; i < prices.length; i++){
            sell = prices[i];
            int currentProfit = sell - buy;
            maxProfit = currentProfit <= 0 ? maxProfit : Math.max(maxProfit, currentProfit);
            buy = Math.min(buy, prices[i]);
        }

        return maxProfit;
    }
}
