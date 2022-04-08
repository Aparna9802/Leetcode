class Solution {
    public void setZeroes(int[][] matrix) {
        
        int firstrow=1,firstcolumn=1;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(j==0 && matrix[i][j]==0)
                    firstcolumn=0;
                if(i==0 && matrix[i][j]==0)
                    firstrow=0;
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        for(int i=1;i<matrix.length;i++)
        {
           for(int j=1;j<matrix[i].length;j++)
           {
               if(matrix[i][0]==0 || matrix[0][j]==0)
                   matrix[i][j]=0;
           }
        }
        
        if(firstrow==0)
        {
        for(int i=0;i<matrix[0].length;i++)
           matrix[0][i]=0;
        }
        
            if(firstcolumn==0)
        {
        for(int i=0;i<matrix.length;i++)
           matrix[i][0]=0;
        }
            
    }
}