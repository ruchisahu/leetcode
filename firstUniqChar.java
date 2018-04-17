/* Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters. 

*/
import java.util.*;
class  firstUniqChar
{
    public static int firstUniqChar(String s)
   {
        if(s.length() == 0 || s == null) return -1;
         char[] c = s.toCharArray();
     
         
         int[] freq = new int[126];
        for(int i=0;i<s.length();i++)
        {
            freq[c[i]]++;
        }
         int index = s.length();
            for(int j=0;j<s.length();j++)
              if(freq[c[j]]==1)
            {
                int idx = s.indexOf(j);
                index = Math.min(idx, index);
                 return j;
            }
               
                   
      
       return -1; 
    }
    
    public static void main(String[] arg)
    {
        String s="leetcodel";
        
        System.out.println(firstUniqChar(s));
    }
}