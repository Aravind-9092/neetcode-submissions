class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // If we find a new minimum price, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Otherwise, check if selling today yields a better profit
                int currentProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }

        return maxProfit;
    }
}