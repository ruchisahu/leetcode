/*73. Set Matrix Zeroes
    Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

Example 1:

Input: 
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output: 
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]
*/
class SetMatrixZeroes 
{
    public static void setZeroes(int[][] matrix)
    {
         int n = matrix.length;
        int m = matrix[0].length;
         boolean firstRowZero = false;
        boolean firstColumnZero = false;
       for(int i=0; i<matrix.length; i++)
       {
            if(matrix[i][0] == 0)
            {
                firstColumnZero = true;
                break;
            }
       }
      for(int i=0; i<m; i++)
      {
            if(matrix[0][i] == 0){
                firstRowZero = true;
                break;
            }
        } 
       for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j] == 0){
                   matrix[i][0] = 0;
                   matrix[0][j] = 0;
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                   matrix[i][j] = 0;
                }
            }
        }
 
        //set first column and row
        if(firstColumnZero){
            for(int i=0; i<n; i++)
                matrix[i][0] = 0;
        }
 
        if(firstRowZero){
            for(int i=0; i<m; i++)
                matrix[0][i] = 0;
        }
        
         for(int i=1; i<n; i++)
         {
            for(int j=1; j<m; j++)
            {
               
                   System.out.println(matrix[i][j]);
                }
            }
 
    }

        
        
    
   
    public static void main(String[] arg)
    {
        int[][] a={ 
            {1,1,1},
            {1,0,1},
            {1,1,1}};
        
        setZeroes(a);

    }
    
}