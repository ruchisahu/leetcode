/*63. Unique Paths II
    A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

Now consider if some obstacles are added to the grids. How many unique paths would there be?
    
    Input:
[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
Output: 2
Explanation:
There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -> Right -> Down -> Down
2. Down -> Down -> Right -> Right
 */   
    class UniquePathsII{
    public static int uniquePathsWithObstacles(int[][] grid)
    {
         if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
          int m = grid.length;    
          int n = grid[0].length;   
          int[][] dp= new int[m][n];   
          for(int k=0; k<n;k++){ 
              if(grid[0][k] == 0) dp[0][k] = 1; 
              else break;  
          }  
          for(int k=0; k<m;k++){ 
              if(grid[k][0] == 0) dp[k][0] = 1;  
              else break; 
          }
  for(int i=1; i< m;i++){ 
      for(int j=1;j<n;j++){  
          if(grid[i][j] == 1){   
              dp[i][j] = 0;   
          }
          else{            
              dp[i][j] = dp[i-1][j] + dp[i][j-1];    
          }         
      }      
  }
        return dp[m-1][n-1];
      
    }
    public static void main(String[] arg)
    {
        int[][] grid={{0,0,0},{0,1,0},{0,0,0}};
      
        System.out.println(uniquePathsWithObstacles(grid));
    }
}