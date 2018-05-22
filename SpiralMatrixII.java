/*59. Spiral Matrix II
    Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

Example:

Input: 3
Output:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
*/
class  SpiralMatrixII {
    public static int[][] generateMatrix(int n) 
    {
     int[][] matrix= new int[n][n];
    int i=0;
         int r1=0,r2=n-1;
         int c1=0,c2=n-1;
         while (r1 <= r2 && c1 <= c2)
         {
             for (int c = c1; c <= c2; c++) 
                 matrix[r1][c]=i++;
             for (int r = r1 + 1; r <= r2; r++)
                 matrix[r][c2]=i++;
              if (r1 < r2 && c1 < c2) 
              {
                for (int c = c2 - 1; c > c1; c--) 
                    matrix[r2][c]=i++;
                for (int r = r2; r > r1; r--) 
                    matrix[r][c1]=i++;
                
            }
              
              r1++;
            r2--;
            c1++;
            c2--;  
         }
        for(int i1=0;i1<n;i1++)
            for(int j=0;j<n;j++)
            System.out.println(matrix[i1][j]);
                 
    return matrix;    
    }
    
     public static void main(String[] arg)
    {
     
         System.out.println(generateMatrix(3) );
    }
}
