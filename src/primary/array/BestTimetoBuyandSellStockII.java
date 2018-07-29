package primary.array;

public class BestTimetoBuyandSellStockII {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            int d = prices[i] - prices[i-1];
            if(d > 0) profit += d;
        }
        return profit;
    }
}