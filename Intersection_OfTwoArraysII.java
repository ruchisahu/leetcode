import java.util.*;
class Intersection_OfTwoArraysII
{
    public static int[] intersect(int[] nums1, int[] nums2) 
    {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int c=0;
        int[] result = new int[nums1.length];
        
        int p1=0, p2=0;
    while(p1<nums1.length && p2<nums2.length)
    {
        if(nums1[p1]<nums2[p2]){
            p1++;
        }else if(nums1[p1]>nums2[p2]){
            p2++;
        }else{
            result[c++]=nums1[p1];
           
            p1++;
            p2++;
 
        }
      //   System.out.println(result[c]);
    }
    
  
    for(int i1=0;i1<c;i1++)
    System.out.println(result[i1]);
    return result;
}
    public static void main(String[] args)
    {
        int[] nums1={1};
         int[] nums2={};
        System.out.println(intersect(nums1,nums2) );
    }
}