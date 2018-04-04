//Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one. 
import java.util.*;
class singleNumber2
{
    public static int singleNumberII(int[] nums) 
    {
        int number;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
        number = nums[i]; 
        if(map.containsKey(number)){
            map.put(number, map.get(number)+1);
        }
        else
        {
            map.put(number, 1);
        }
        }
         for(int key : map.keySet()){
        if(map.get(key).equals(1))
        {
            return key; 
        }
         }
        
        return 0;
    }
    public static void main(String[] arg)
    {
        int[] a={1,1,1,2,2,2,3,3};
        System.out.println(singleNumberII(a));
    }
}