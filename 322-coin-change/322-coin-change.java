class Solution {
    public int coinChange(int[] coins, int amount) {
       
        int[] dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        //a[0]=coins[0];
        dp[0]=0;
        for(int i=0;i<coins.length;i++)
        {
            
            for(int j=coins[i];j<=amount;j++)
            {
                if(dp[j-coins[i]]!=Integer.MAX_VALUE)
                {
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
            
        }
        if(dp[amount]==Integer.MAX_VALUE)
            return -1;
        return dp[amount];
    }
}