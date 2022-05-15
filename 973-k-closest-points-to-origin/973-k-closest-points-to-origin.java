class Solution {
    public int[][] kClosest(int[][] points, int k) {
   /*     int a[][]=new int[points.length][2];
        int g[][]=new int[k][2];
         int res;
        for(int i=0;i<points.length;i++)
        {
           res=0;
           for(int j=0;j<2;j++)
          res = res+ (points[i][j] * points[i][j]);
            //storing the index and their distance in 2d array
            a[i][0]=i;
            a[i][1]=res;
        }
        //sorting based on their distance in asc order
      Arrays.sort(a,(b,c) -> b[1]-c[1] );
        int index=0;
        for(int i=0;i<k;i++)
        {
            index=a[i][0];
            //storing least distant values in 2d array
            g[i]=points[index];
        }
        return g;
        */
        /*
        Since another point is origin the distance formula will be sqrt(x^2+y^2)
        in priority queue lamba expresssion to sort is second points distance - first point distance. minus here is used to find smallest of these two so first point is denoted as a and second point is denoted as b
so first point contains 
a[0]- x axis a[1]- y axis
b[0]- x axis b[1]- y axis

now formula for lambda will become
distance of point b (b[0]*b[0]+b[1]*b[1]) - distance of point a (a[0]*a[0]+a[1]*a[1])

        */
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b) -> (b[0]*b[0] + b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
            
           for(int[] point : points )
           {
               q.add(point);
               if(q.size()>k)
                   q.remove();
           }
        int[][] ans=new int[k][2];
        int d=0;
        for(int[] s : q)
        {
            if(d<k)
            ans[d++]=s;
        }
        return ans;
    }
}