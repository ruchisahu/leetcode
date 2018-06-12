/*84. Largest Rectangle in Histogram
    Given n non-negative integers representing the histogram's
    bar height where the width of each bar is 1, find the area of largest rectangle
    in the histogram.
    
    Example:

Input: [2,1,5,6,2,3]
Output: 10
*/
import java.util.*;
class LargestRectangleinHistogram {
    public static int largestRectangleArea(int[] heights)
    {
        Stack<Integer> stack = new Stack<Integer>();// stack for index to caculate width.  
        int max = 0;     
        int i =0;    
        while( i <= heights.length){  
            int val = i < heights.length ? heights[i] : 0;   
            if(stack.empty() || val >= heights[stack.peek()]){  
                stack.push(i);    
                i++;          
            }else{        
                int h = stack.pop();     
                int w = stack.empty() ? i : i - stack.peek() -1;    
                max = Math.max(max, heights[h] * w);      
            }    
        }
        return max; 
     
       
    }
    public static void main(String[] arg)
    {
        int[] h={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(h));
    }
}


