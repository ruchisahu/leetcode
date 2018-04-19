 /*Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:

    Each element in the result should appear as many times as it shows in both arrays.
    The result can be in any order.

Follow up:

    What if the given array is already sorted? How would you optimize your algorithm?
    What if nums1's size is small compared to nums2's size? Which algorithm is better?
    What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
*/
import java.util.*;
class IntersectionOfTwoArraysII
{
    public static int[] intersect(int[] nums1, int[] nums2) 
    {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int p1=0, p2=0;
    while(p1<nums1.length && p2<nums2.length)
    {
        if(nums1[p1]<nums2[p2]){
            p1++;
        }else if(nums1[p1]>nums2[p2]){
            p2++;
        }else{
            list.add(nums1[p1]);
            p1++;
            p2++;
 
        }
    }
    int[] result = new int[list.size()];
    int i=0;
    while(i<list.size()){
        result[i]=list.get(i);
        i++;
    }
    for(int i1=0;i1<result.length;i1++)
    System.out.println(result[i1]);
    return result;
}
    public static void main(String[] args)
    {
        int[] nums1={1,2,2,3,7};
         int[] nums2={7,2,2};
        System.out.println(intersect(nums1,nums2) );
    }
}