class Water
{
    int height=0;
    int index=0;
}
class Solution {
    
    public int trap(int[] height) {
        
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        int n=height.length;
        int max=0,unit=0;
        for(int i=0;i<n;i++)
        {
            left[i]=max;
            max=Math.max(max,height[i]);
         
        }
        max=0;
         for(int i=n-1;i>=0;i--)
        {
            right[i]=max;
            max=Math.max(max,height[i]);
        }
        
        for(int i=0;i<n;i++)
        {
            int temp=Math.min(left[i],right[i])-height[i];
           
            if(temp>0)
            {
       
            unit=unit+temp;
            }
        }
        return unit;
        
        
        
        
  /*     Stack<Water> s=new Stack<>();
        int cur=0,prev=0,curh=0,prevh=0;
        prevh=height[0];
        int sh=0;
        int temp=0;
        int unit=0;
        for(int i=height[0]==0?1:0;i<height.length;i++)
        {
            curh=height[i];
            cur=i;
            if(curh<prevh)
            {
                Water w=new Water();
                w.index=prev;
                w.height=prevh;
                s.push(w);
                System.out.println(w.height+" "+w.index);
             }
            
            if(curh>=prevh && !s.isEmpty())
            {
                 Water w=new Water();
                w.index=prev;
                w.height=prevh;
                s.push(w);
                
                while(!s.isEmpty())
                {
                    Water p=s.pop();
                    temp=temp+(Math.min(curh,p.height))-sh;
                    sh=p.height;
                    System.out.println(temp+" "+sh+" "+curh+" "+p.height);
                }
                sh=0;
                unit=unit+temp;
                System.out.println("unit is"+unit);
                temp=0;
            }
            else if(curh>=prevh)
            {
                unit=unit+(cur-prev)+prevh;
            }
          
            prev=i;
            prevh=height[i];
            System.out.println("unit is "+unit);
        }
        return unit;
        */
    }
}