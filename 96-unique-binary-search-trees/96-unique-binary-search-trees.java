class Solution {
    // solved using nth catalan
    public int numTrees(int n) {
        int res=1;
        int[] dp=new int[n+2];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=0;
            for(int j=0;j<i;j++)
            {
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
        
    }
}