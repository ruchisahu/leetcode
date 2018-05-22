/*4. Median of Two Sorted Arrays
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0


logic is if mid1 is greater take only second half of array2.
if mid2 is greater take only 2nd part of array1
*/

class MedianOfTwo_SortedArrays 
{
     public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
       int n=nums1.length;
        int m=nums2.length;
        int len=m+n;
        System.out.println(len);
        System.out.println(len/2+1);
        System.out.println(len/2);
        if(len%2==0)
        return  (findk(nums1, 0, nums2, 0, len/2+1) +findk(nums1, 0, nums2, 0, len/2))*0.5;
        else
            return findk(nums1,0,nums2,0,len/2+1);
    }
    public static int findk(int a[],int s1,int b[],int s2,int k)
    {
        if(s1>=a.length)
            return b[s2+k-1];
        if(s2>=b.length)
            return a[s1+k-1];
        if(k==1)
            return Math.min(a[s1],b[s2]);
        int m1=s1+k/2-1;
        System.out.println("m1="+m1);
        int m2=s2+k/2-1;
        System.out.println("m2="+m2);
            int mid1=m1<a.length?a[m1]:Integer.MAX_VALUE;
         int mid2=m2<b.length?b[m2]:Integer.MAX_VALUE;
         if(mid1<mid2)
             return findk(a ,m1+1,b,s2, k-k/2);     //cut half of the elements of a 
         else
             return findk(a, s1,b,m2+1,k-k/2);
        
      
    }

    public static void main(String[] arg)
    {
        int[] a={1,2};
        int[] b={3,4};
        System.out.println(findMedianSortedArrays(a,b));
    }
}