class Solution {
    public int jump(int[] nums) {
        
     
    /*    int[] dp=new int[10008];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        int x=nums[0];
        int cur=0;
   /*     for(int i=1;i<nums.length;i++)
        {
            int jump=dp[i-1]+1;
          //  System.out.println(jump+" "+cur+" "+x);
         //    x=i+nums[i];
           /* for(int j=i;j<nums.length;j++)
            {
                //checking min from i to n using j-i+1 how far i-1 can travel
                if(nums[i-1]-(j-i+1)>=0)
                    dp[j]=Math.min(jump,dp[j]);
            }*/
        /*
            for(int j=i;j<=x;j++)
            dp[j]=Math.min(dp[j],jump);
            
          //  i=x-1;
          //  System.out.println(dp[x]);
            cur=x;
            x=i+nums[i];
        }
        
        return dp[nums.length-1];
     */
        int l=0,r=0,ans=0,farthest=0;
         while(r<nums.length-1)
         {
             farthest=0;
             for(int i=l;i<=r;i++)
             {
                 farthest=Math.max(farthest,i+nums[i]);
             }
             l=r+1;
             r=farthest;
             ans++;
         }
        return ans;
         
        
    }
}