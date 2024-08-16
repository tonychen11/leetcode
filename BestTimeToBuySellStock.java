class Solution {
    public int maxProfit(int[] prices) {
        //brute force method - double for loop to go through all possible combinations O(n^2) time complexity
        //optimized - keep track and update lowest buy price
        //update max profit if current profit is more and greater than 0

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
