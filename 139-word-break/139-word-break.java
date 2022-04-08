class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        
        boolean[] b=new boolean[s.length()+2];
        b[0]=true;
        for(int i=0;i<=s.length();i++)
        {
            if(b[i]==true)
            {
                for(String c:wordDict)
                {
                    if((i+c.length())<=s.length() && s.substring(i,i+c.length()).equals(c) )
                        b[i+c.length()]=true;
                   
                }
            }
        }
        return b[s.length()];
        
    }
}