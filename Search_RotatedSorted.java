/*Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

*/
class Search_RotatedSortedArray
{
    public static int search(int[] nums, int target)
    {
        int i=0;
        int mid;
        int j=nums.length-1;
        while(i<=j)
        {
             mid=(i+j)/2;
          
            if(nums[mid]==target)
                return mid;
            
            if(nums[mid]>=nums[i])
            {
                if(nums[i]<=target && target<=nums[mid])
                    j=mid-1;
                else
                    i=mid+1;
                
            }
            
            else
            {
                if(nums[mid]<target && target<=nums[j])
                i=mid+1;
            else
                j=mid-1;
            }
            
        }
    
       return -1; 
        
    }
     public static void main(String[] arg)
    {
         int[] a={4,5,6,7,0,1,2};
      System.out.println(search(a,7));
    }
}