/*78. Subsets
    Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]


*/
import java.util.*;
class Subsets1
{
    public static List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        subset_helper(list,new ArrayList<Integer>(),nums,0);
        return list;
    }
     static void subset_helper( List<List<Integer>> list,List<Integer>tempList, int[] nums,int start)
     {
         
             list.add(new ArrayList<Integer>(tempList));
         
             for(int i=start;i<nums.length;i++)
             {
                 if(tempList.contains(nums[i])) continue; 
                 tempList.add(nums[i]);
                 subset_helper(list,tempList,nums,i+1);
                 tempList.remove(tempList.size()-1);
             }
         }
     
     
         
    public static void main(String[] arg)
    {
        int[] nums={1,2,3};
       System.out.println(subsets(nums));
    
    }


    }
