import java.util.*;
class lengthOfLongest_Substring {
    public static int lengthOfLongestSubstring1(String str) //brute force time exceed
    {
       int len=str.length();
       // if(str==null) return 0;
    
        int result=0;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<=len;j++)
            {
                if(isUnique(str,i,j))
                {
                    result=Math.max(result,(j-i));
                }
            }
        }
        return result;
    }
    public static boolean isUnique(String s,int i,int j)
    {
        ArrayList<Character> set=new   ArrayList<Character>();
      
         for(int k=i;k<j;k++)
        {
              Character ch = s.charAt(k);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
         return true;  
    }
    
     public static int lengthOfLongestSubstring(String str) 
    {
         boolean[] check=new boolean[256];
         int j=0;
         int maxlen=0;
         for(int i=0;i<str.length();i++)
         {
             while(check[str.charAt(i)])
             {
                 check[str.charAt(j)]=false;
                 j++;
             }
             
             check[str.charAt(i)]=true;
             maxlen=Math.max(i-j+1,maxlen);
         }
         return maxlen;
     }
     public static void main(String[] args)
    {
         String str="abcaaaaabbbbcccwerty";
       
       System.out.println(lengthOfLongestSubstring(str));
    }
}