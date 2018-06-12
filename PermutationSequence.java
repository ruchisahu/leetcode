/*60. Permutation Sequence
    The set [1,2,3,...,n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

    "123"
    "132"
    "213"
    "231"
    "312"
    "321"

Given n and k, return the kth permutation sequence.

Note:

    Given n will be between 1 and 9 inclusive.
    Given k will be between 1 and n! inclusive.

Example 1:

Input: n = 3, k = 3
Output: "213"
*/
import java.util.*;
    class PermutationSequence
{
    int count=0;
    public String getPermutation(int n, int k) {
     
      
         if(nums.length==tempList.size())
             list.add(new ArrayList<Integer>(tempList));
         count++;
         if(count==3)
             System.out.println(tempList);
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


    }
}