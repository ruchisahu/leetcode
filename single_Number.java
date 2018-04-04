
import java.util.*;
class single_Number {
    public static int singleNumber(int[] nums)
    {
        int value;
        Set<Integer> count=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(count.contains(nums[i]))
                count.remove(nums[i]);
            else
                count.add(nums[i]);
        }
        return count.iterator().next();        //return first element
    }
    
   
    
    public static void main(String[] arg)
    {int[]a={1,1,7,5,5};
        System.out.println(singleNumber(a));
    }
}