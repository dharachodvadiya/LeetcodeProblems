class Solution {
    public int islandPerimeter(int[][] grid) {
        int rCount = grid.length;
        int cCount = grid[0].length;
        int parm = 0;
        
        for(int i=0; i< rCount; i++)
        {
            for(int j =0; j<cCount; j++ )
            {
                
                if(grid[i][j] == 1)
                {
                    parm += (i>0) ? ((grid[i-1][j]==0) ? 1 : 0) : 1;
                    parm += (i< rCount-1 ) ? ((grid[i+1][j]==0) ? 1 : 0) : 1;
                    parm += (j>0) ? ((grid[i][j -1]==0) ? 1 : 0) : 1;
                    parm += (j< cCount-1) ? ((grid[i][j + 1]==0) ? 1 : 0) : 1;
                
                }
            }
        }
        return parm;
        
    }
}