/*709. To Lower Case
   Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

 

Example 1:

Input: "Hello"
Output: "hello"
*/
class toLowerCase {
    public static String toLowerCase(String str)
    {
        char[] a=str.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>='A' && a[i]<='Z')
            {
                a[i]=(char)(a[i]-'A'+'a');
                    
            }
        }
        return new String(a);
    }
    public static void main(String[] arg)
    {
        String s="HelloA";
        System.out.println(toLowerCase(s));
    }
}