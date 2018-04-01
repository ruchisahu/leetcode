//TWO SUM

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

*/
import java.util.*;
class Two_Sum {
    public int[] twoSum(int[] nums, int target)  //brute Force
    {
        int[] sum=new int[2];
      for(int i=0;i<nums.length-1;i++) 
      {
          for(int j=i+1;j<nums.length;j++)
          {
          if((nums[i]+nums[j])==target)
          {
              sum[0]=i;
              sum[1]=j;
          }
          }
             
      }
      for(int j=0;j<sum.length;j++)
          {
      System.out.println(sum[j]);
      }
        return sum;
    }
    
    public int[] twoSumfast(int[] nums, int target)  //two pointer
    {
       Arrays.sort(nums);
       int i=0;
       int j=nums.length-1;
       while(i<j)
       {
           int sum=nums[i]+nums[j];
           if(sum<target)
           {
               i++;
           }
           else if(sum>target)
           {
               j--;
           }
           else
           {
               return new int[]{i+1,j+1};
           }
       }
       throw new IllegalArgumentException("no sum");
    }
             
      
  
    
    public static void main(String[] args)
    {
        Two_Sum sum=new Two_Sum();
        int[] a={1,4,6,2,7,19};
        int target=20;
      //  sum.twoSum(a,target);
        sum.twoSumfast(a,target);
    }
}