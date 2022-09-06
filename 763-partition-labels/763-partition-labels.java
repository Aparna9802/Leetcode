class Solution {
    public List<Integer> partitionLabels(String s) {
       
        int[] index=new int[100];
        
        for(int i=0;i<s.length();i++)
        {
            index[s.charAt(i)-'a']=i;
        }
        int start=0,end=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int ind=index[c-'a'];
            end=Math.max(ind,end);
           // System.out.println(end);
            if(end==i)
            {
               //  System.out.println("length is "+end+" "+start+" "+(end-start+1));
                l.add(end-start+1);
                start=end+1;
            }
        }
        
        return l;
         
    }
}