/*62. Unique Paths
    A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?
    Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right

*/
class  UniquePaths {
    public static int uniquePaths(int m, int n) 
    {
        int[][] up=new int[m][n];
        for(int i=0;i<n;i++)
            up[0][i]=1;
        for(int j=0;j<m;j++)
            up[j][0]=1;
        
        for(int i=1;i<m;i++) 
        {
        for(int j=1;j<n;j++)
        {
            up[i][j]=up[i-1][j]+up[i][j-1];
        }
        }
        return up[m-1][n-1];
    }
    public static void main(String[] arg)
    {
        int m=3;
        int n=2;
        System.out.println(uniquePaths(m,n));
    }
}