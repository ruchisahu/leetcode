import java.util.*;
class longest_Consecutive {
    public static int longestConsecutive(int[] nums)
    {
        int count;
        int max=0;
        List<Integer> set=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            
           // int item=nums[i]+1;
        if(!set.contains(nums[i]-1))
        {
            int item=nums[i];
            count=1;
          while(set.contains(item+1))
          {
              item++;
              count++;
              
          }
        
          max=Math.max(count,max);
        }
        }
        return max;  
    }
    public static void main(String[] args)
    {
        int[] a={100, 4, 200, 1, 3, 2};
         int[] a1={100,1,101};
        System.out.println(longestConsecutive(a));
    }
}