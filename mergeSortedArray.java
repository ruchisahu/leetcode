/*88. Merge Sorted Array

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
*/

class mergeSortedArray {
    public static void merge(int[] a, int m, int[] b, int n) 
    {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
            while(j>=0 && i>=0&& k>=0)
            {
                //   System.out.println("check");
                //   System.out.println(a[i]);
               //    System.out.println(b[j]);
                if(a[i]>b[j])
                {
                    a[k]=a[i--];
                  //  System.out.println("i"+a[k]);    
                }
                else
                {
                    a[k]=b[j--];
                    //   System.out.println("j"+a[k]);  
                }
                k--;
            }
      while(j>-1)
          a[k--]=b[j--];
        for(int v=0;v<a.length;v++)
        {
            System.out.println(a[v]);  
        }
        
    }
     public static void main(String[] arg)
    {
         int[] a=new int[]{0,0};
  
     int[]b={1};
     merge(a,1,b,1);
    }
}