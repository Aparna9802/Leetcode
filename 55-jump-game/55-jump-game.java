class Solution {
    int[] d=new int[100001];
    public boolean canJump(int[] nums) {
       /*  brute force
        
        boolean[] dp=new boolean[100001];
       // Arrays.fill(dp,false);
        dp[0]=true;
        
        if(nums.length==1)
            return true;
        for(int i=0;i<nums.length;i++)
        {
              if(dp[i]==true)
          {
            for(int j=0;j<=nums[i];j++)
            {
            if(i+j==nums.length-1)
                return true;
           
        if((i+j)<=(nums.length-1))
             dp[i+j]=true;
            } 
              }
            
        }
        return  dp[nums.length-1];
        */
        /*
        boolean[] dp=new boolean[100001];
        dp[0]=true;
        for(int i=0;i<nums.length-1;i++)
        {
            // if number is greater than zero then it can reach atleast one next position  
            if(nums[i]>0)
                dp[i+1]=true;
            else
            {
                // if element is zero
                //to check if any element before i can bypass this zero valued index 
                int j=i-1;
                
                // if first element itself is zero then it cannot reach any element
                if(j<0)
                    return false;
                
                while(j>=0)
                {
                    if((i-j+1)<=nums[j])
                    {   dp[i+1]=true;
                     break;
                    }
                    j--;
                }
                // if cannot reach after this j loop then return false
                if(j<0)
                    return false;
                
            }
        }
        
        return dp[nums.length-1];
        */
        
        int lastreachableIndex=nums.length-1;
        
        for(int i=lastreachableIndex-1;i>=0;i--)
        {
            if(i+nums[i]>=lastreachableIndex)
                lastreachableIndex=i;
            
            //lastindex=8
            //
        }
        return lastreachableIndex==0;
        
        
       /* int reach=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>reach)
                return false;
            if(i+nums[i]>reach)
                reach=i+nums[i];
            
           // System.out.println(i+" "+reach);
        }
        
        return reach>=nums.length-1;
        */
        
      /*  boolean[] dp=cansum(nums,nums.length-2,nums.length-1);
        return dp[nums.length-1];
    }
    
    public boolean[] cansum(int[] a,int s,int e)
    {
        if(s<0)
            return false;
        if(s+a[s]==e)
            return true;
        for(int i=e;i>=s;i--)
        {
            d[i]=cansum(a,i-1,i);
        }
        
        return d;   */
    }
}