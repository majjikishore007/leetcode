class Solution {
    public int maxProfit(int[] prices) {
        // the price must be of size atleast 2
		if (prices.length < 2) {
			return 0;
		}
		int minPrice = prices[0];
		int maxProfit = prices[1] - prices[0];
		for (int i = 1; i < prices.length; i++) {
			int currPrice = prices[i];
			int profit = currPrice - minPrice;
			maxProfit = Math.max(maxProfit, profit);
			minPrice = Math.min(currPrice, minPrice);
		}
		if (maxProfit > 0) {
			return maxProfit;
		}
		return 0;
    }
}