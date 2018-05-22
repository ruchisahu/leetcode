/*75. Sort Colors
    
    Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

Example:

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Follow up:

    A rather straight forward solution is a two-pass algorithm using counting sort.
    First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
    Could you come up with a one-pass algorithm using only constant space?
    
    */

class sort_Colors {
    public static void sortColors(int[] nums)
    {
        int[] arr=new int[3];
        arr[0]=0;
        arr[1]=0;
        arr[2]=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            arr[nums[i]]++;
            
        }
      //  System.out.println(arr[0]);
      //    System.out.println(arr[1]);
      //      System.out.println(arr[2]);
            int j=0,k=0;
            while(arr[j]--!=0)
            {
                nums[k++]=0;
                
                
            }
            j++;
            while(arr[j]--!=0)
            {
                nums[k++]=1;
               
            }
            j++;
            while(arr[j]-- !=0)
            {
                nums[k++]=2;
               
            }
             for(int i=0;i<n;i++)
        {
            System.out.println(nums[i]);
            
        }
    }
    
    public static void main(String[] arg)
    {
        int[] a={2,0,2,1,1,0};
        sortColors(a);
    }
}

