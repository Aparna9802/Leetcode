class Solution {
    public boolean isUgly(int n) {
        
       
        while(n>1)
        {
            if(n%2!=0)
                break;
            n=n/2;
        }
        while(n>1)
        {
            if(n%3!=0)
                break;
            n=n/3;
        }
        while(n>1)
        {
            if(n%5!=0)
                break;
            n=n/5;
        }
        if(n==1)
            return true;
        
        return false;
        
        
    }
}