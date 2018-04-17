/*Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh". 
*/    
    class reverseString 
{
        
        public static String reverseString1(String s)   //array swapping methode
    {
        char[] c = s.toCharArray();
        for (int i=0,j=c.length-1;i<j;i++,j--){
            char temp = c[i];
            c[i]=c[j];
            c[j]=temp;
        }
        return new String(c);
    }
    public static String reverse_String(String s)            //time limit exceeded
    {
        if(s == null || s.length() == 0)
            return "";
        String str="";
        for(int i=0;i<s.length();i++)
        {
            str=s.charAt(i)+str;
        }
        
        return str;
        
    }
    public static void main(String[] arg)
    {
        String s="hello";
        
        System.out.println(reverse_String(s));
    }
}