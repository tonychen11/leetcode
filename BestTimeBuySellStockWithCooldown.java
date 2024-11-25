class Solution {
    public int maxProfit(int[] prices) {
        Map<Pair<Integer, Boolean>, Integer> dp = new HashMap<>();

        return dfs(prices, 0, true, dp);
    }

    public int dfs(int[] prices, int currentStock, boolean buying, Map<Pair<Integer, Boolean>, Integer> dp){
        if(currentStock >= prices.length){
            return 0;
        }

        Pair<Integer, Boolean> pair = new Pair(currentStock, buying);

        if(dp.containsKey(pair)){
            return dp.get(pair);
        }

        int cooldown = dfs(prices, currentStock + 1, buying, dp);

        if(buying){
            int buy = dfs(prices, currentStock + 1, !buying, dp) - prices[currentStock];
            dp.put(pair, Math.max(buy, cooldown));
        }
        else{
            int sell = dfs(prices, currentStock + 2, !buying, dp) + prices[currentStock];
            dp.put(pair, Math.max(sell, cooldown));
        }

        return dp.get(pair);
    }
}
