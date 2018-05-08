/*46. Permutations
    Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
*/
import java.util.*;
class Permutations {
    public static  List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        permute_helper(list,new ArrayList<Integer>(),nums);
        return list;
    }
     static void permute_helper( List<List<Integer>> list,List<Integer>tempList, int[] nums)
     {
         if(nums.length==tempList.size())
             list.add(new ArrayList<Integer>(tempList));
         else
         {
             for(int i=0;i<nums.length;i++)
             {
                 if(tempList.contains(nums[i])) continue; 
                 tempList.add(nums[i]);
                 permute_helper(list,tempList,nums);
                 tempList.remove(tempList.size()-1);
             }
         }
     }
     
         
    public static void main(String[] arg)
    {
        int[] nums={1,2,3};
       System.out.println( permute(nums));
     //  System.out.println( permute_1(nums));
    }
}

