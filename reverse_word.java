/* Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the". 
*/
import java.util.*;
public class reverse_word {
    public static String reverseWords(String s)
    {
         StringBuilder word=new StringBuilder();
        // word="";
         int len=s.length();
         int end=len;
         for(int k=len-1;k>=0;k--)
            {
             if(s.charAt(k)==' ')
             {
                 end=k;
             }
             else if(k==0 || s.charAt(k-1)==' ')
             {
                 if(word.length()!=0)
                 {
                     word.append(' ');
                 }
                  word.append(s.substring(k,end));
             }
                 
         }
        return word.toString();
    }
    public static void main(String[] args)
    {
       
       System.out.println(reverseWords("the sky is blue"));
    }
}