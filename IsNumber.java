/* if a given string is numeric.

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
*/

class IsNumber {
    public static  boolean isNumber(String s) 
    {
        int len=s.length();
        char[] a=s.toCharArray();
        int i=0;
        int count=0;
         while(i<len && Character.isWhitespace(s.charAt(i))) 
         {
             i++;
             count++;
         }
         if(i<len && (s.charAt(i)=='+' || s.charAt(i)=='-') )
             i++;
         boolean flag=false;
        while(i<len)
        {
             if(s.charAt(0)=='.') return false;
            if(Character.isDigit(a[i]) || s.charAt(i)=='.')
            {
                
                count++;
                flag=true;
            }
            i++;
           System.out.println(count);
           System.out.println(len);
        }
        if(count==len && flag==true) return true;
        return false;
    }
    public static void main(String[] args)
    {
        String str="1  ";
        System.out.println(isNumber(str));
    }
}