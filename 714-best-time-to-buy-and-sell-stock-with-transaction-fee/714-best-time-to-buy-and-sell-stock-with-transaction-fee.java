class Solution {
    public int maxProfit(int[] prices, int fee) {
        int profit=0;
        int buy=Integer.MIN_VALUE,sell=0,prev=0;
        for(int i=0;i<prices.length;i++)
        {
            prev=buy;
            buy=Math.max(buy,profit-prices[i]-fee);
            profit=Math.max(profit,prices[i]+prev);
            
        
        }
        return profit;
    }
}