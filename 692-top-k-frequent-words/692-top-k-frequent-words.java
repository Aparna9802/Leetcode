class Solution {
    
    public List<String> topKFrequent(String[] words, int k) {
        
      Map<String,Integer> m=new HashMap<>();
     
        for(String word:words)
        {
            m.put(word,m.getOrDefault(word,0)+1);
        }
        
         List<String> l1=new ArrayList<>();
      for(String word:m.keySet())
    	  l1.add(word);
      Collections.sort(l1,new Comparator<String>()
    		  {
    	  public int compare(String a,String b)
    	  {
    		  if(m.get(a)==m.get(b))
    		  {
    			  return a.compareTo(b);
    		  }
    		  else
    		  return m.get(b)-m.get(a);
    	  }
    		  });
        List<String> l2=new ArrayList<>();
        for(int i=0;i<k;i++)
            l2.add(l1.get(i));

        return l2;
        
    }
}