class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0,max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
                min=prices[i];
            else
            {
                profit=prices[i]-min;
                max=Math.max(max,profit);
                profit=max;
            }
        }
        return profit;
    }
}