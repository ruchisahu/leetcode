//Valid Palindrome

 /*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome. */


class valid_palindrome
{
 public static boolean isPalindrome(String s)
 {
    int len=s.length();
    int j=len-1;
    String st=s.toUpperCase( );
    char[] str = st.toCharArray();

    for(int i=0;i<len/2;i++) 
    {
         
       while (!Character.isLetterOrDigit(str[i]))
       {
        //   System.out.println(i);
           i++;
       }
            
        while(!Character.isLetterOrDigit(str[j]))
        {
         //    System.out.println(j);
            j--;
        }
        System.out.println(str[i]);
          System.out.println(str[j]);    
        if(str[i]!=str[j])
            break;
           
   if(!isSame(str[i],str[j]))
                 return false;
    }
    return true;
 }
 public static boolean isNum(char a){
        if(a >= '0' && a <= '9'){
            return true;
        }else{
            return false;
        }
    }
 
    public static boolean isSame(char a, char b){
        if(isNum(a) && isNum(b)){
            return a == b;
        }else if(Character.toLowerCase(a) == Character.toLowerCase(b)){
            return true;
        }else{
            return false;
        }
    }
       
public static void main(String[] args)
{
   String str= "A man, a plan, a canal: Panama";
   String str1="race a car";
   System.out.println(isPalindrome(str1));
}
}