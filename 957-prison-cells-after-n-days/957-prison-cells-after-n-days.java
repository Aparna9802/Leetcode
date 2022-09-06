class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
      for (int j=(n-1)%14 +1; j>0;j--){
            int[] c2=new int[8];
            for (int i=1;i<7;++i){
                c2[i]= (cells[i-1]==cells[i+1])?1:0;
            }
            cells=c2;
        }   
        return cells;
    }
        
        
    
}