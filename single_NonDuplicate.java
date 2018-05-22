/*540. Single Element in a Sorted Array
    
     Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.

Example 1:

Input: [1,1,2,3,3,4,4,8,8]
Output: 2

Example 2:

Input: [3,3,7,7,10,11,11]
Output: 10
*/

class  single_NonDuplicate {
    public static int singleNonDuplicate(int[] nums)
    {
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi)
        {
            int mid;
            mid=(lo+hi)/2;
            if(mid%2==1)
                mid=mid-1;
            if(nums[mid]!=nums[mid+1]) hi=mid;
            else
                lo=mid+2;
        }
    return nums[lo];
        
    }
 public static void main(String[] arg)
    {
        int[] nums={1,1,2,2,5,5,7,7,8};
        System.out.println(singleNonDuplicate(nums));
    }
}