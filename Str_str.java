/* Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. 
*/
class Str_str {
    public static int strStr(String haystack, String needle) 
    {
        if (haystack == null || needle == null)
        return -1; 
        
        int len1=haystack.length();
        int len2=needle.length();
        int j;
                
        for(int i=0;i<len1-len2+1;i++)
        {
            j=0;
            while(j<len2 )
            {
                if(needle.charAt(i)==haystack.charAt(j))
                {
                    j++;
                    
                }
               
            }
            if(j==len2)
                return i;
        }
        return -1;
    }
    public static int strStr1(String haystack, String needle)
    {   
        for(int i=0;;i++)
        {
        for(int j=0;;j++)
            {
            if(j==needle.length())return i;
            if(i+j==haystack.length()) return -1;
                if(needle.charAt(j)!=haystack.charAt(i+j))
                {
                    break;
                    
                }
               
            }
            
        }
    
    }   
    public static void main(String[] args)
    {
        String h="asddfgg";
        String n="dd";
        //strStr(h,n);
        System.out.println(strStr1(h,n));
    }
}