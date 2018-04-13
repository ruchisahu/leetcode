/* Follow up for "Search in Rotated Sorted Array":
    What if duplicates are allowed?

    Would this affect the run-time complexity? How and why?

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Write a function to determine if a given target is in the array.

The array may contain duplicates.
*/

class SearchinRotatedSortedArrayII {
    public static boolean search(int[] nums, int target) 
    {
        int i=0;
        int mid;
        int j=nums.length-1;
        while(i<=j)
        {
            mid=(i+j)/2;
            
            if(nums[mid]==target)
                return true;
            
            if(nums[mid]>nums[i])
            {
                if(nums[i]<=target && target<nums[mid])
                    j=mid;
                         
                else
                    i=mid+1;
                
            }
            
            else if (nums[mid]<nums[i])
            {
                if(nums[mid]<target && target<nums[i])
                    i=mid+1;
                else
                    j=mid;
            }
            else
                i++;
            
        }
        
        return false;
    }
    public static void main(String[] arg)
    {
         int[] a={3,1,1};
      System.out.println(search(a,3));
    }

}