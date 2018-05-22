/*54. Spiral Matrix
    
    Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]

*/
import java.util.*;
class  SpiralMatrix 
{
    public static List<Integer> spiralOrder(int[][] matrix)
    {
         ArrayList<Integer> list= new ArrayList<Integer>();
         if(matrix.length==0) return list;
         int r1=0,r2=matrix.length-1;
         int c1=0,c2=matrix[0].length-1;
         while (r1 <= r2 && c1 <= c2)
         {
             for (int c = c1; c <= c2; c++) 
                 list.add(matrix[r1][c]);
             for (int r = r1 + 1; r <= r2; r++)
                 list.add(matrix[r][c2]);
              if (r1 < r2 && c1 < c2) 
              {
                for (int c = c2 - 1; c > c1; c--) 
                    list.add(matrix[r2][c]);
                for (int r = r2; r > r1; r--) 
                    list.add(matrix[r][c1]);
                
            }
              
              r1++;
            r2--;
            c1++;
            c2--;  
         }
             
                 
    return list;    
    }
    
     public static void main(String[] arg)
    {
         int[][] matrix= {{ 1, 2, 3 },
             { 4, 5, 6 },
             { 7, 8, 9 }};
       
         System.out.println(spiralOrder(matrix));
    }
}
