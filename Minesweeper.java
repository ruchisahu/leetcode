class Minesweeper
{
    public static void updateBoard(boolean[][] board, int[] click,int m,int n)
    {
      // print game
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
                if (board[i][j]) 
            {
              //  System.out.print(board[i][j]);
                System.out.print("* ");
            }
                else        
                    System.out.print(". ");
            System.out.println();
        }  
        // sol[i][j] = # bombs adjacent to cell (i, j)
        int[][] sol = new int[m+2][n+2];
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                // (ii, jj) indexes neighboring cells
                for (int ii = i - 1; ii <= i + 1; ii++)
                    for (int jj = j - 1; jj <= j + 1; jj++)
                        if (board[ii][jj])
                                  sol[i][j]++;
 // print solution
        System.out.println();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (board[i][j]) System.out.print("* ");
                else             System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] arg)
    {
        int m=5;
         int n=5;
         double p=0.3;
         boolean[][] board = new boolean[m+2][n+2];
         for(int i=1;i<=m;i++)
         {
             for(int j=1;j<=n;j++)
             {
                 board[i][j]=(Math.random()<p);
             }
         }
        
         int[] click={3,1};
         updateBoard( board, click,m,n);
    }
}