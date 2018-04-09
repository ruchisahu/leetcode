/*Find Minimum in Rotated Sorted Array
    Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
*/

class find_Min {
    public static int findMin(int[] nums) 
    {
       
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
        if(nums[j]>=nums[i]) return nums[i];
        int mid=(i+j)/2;
        if(nums[mid]>=nums[i])
            i=mid+1;
        else
            j=mid;
        
        }
       return -1; 
        
    }
     public static void main(String[] arg)
    {
         int[] a={4,5,6,7,0,1,2};
      System.out.println(findMin(a));
    }
}