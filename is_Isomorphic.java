/*Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

*/
import java.util.HashMap;
import java.util.Map;

class is_Isomorphic{
    public static boolean isIsomorphic(String s, String t)
    {
        if(s.length()!=t.length()) return false;
         if(s.equals(t)) return true;
       
        Map<Character,Character> map = new HashMap<Character,Character> ();
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))                       //unique key
            {
               if( map.containsValue(t.charAt(i)))                     //error:unique key
               {
                   return false;
               }
               else
               {
                map.put(s.charAt(i),t.charAt(i));
                System.out.println("inside="+t.charAt(i));
                System.out.println("inside-"+s.charAt(i));
               }
            }
            else
            {
                char value=map.get(s.charAt(i));
                System.out.println(value);
                 System.out.println("out="+s.charAt(i));
                if(value!=t.charAt(i))
                    return false;
            }
            
        }
       
        return true;
    }
    public static void main(String arg[])
    {
        String s1="ab";
        String s2="aa";
        System.out.println(isIsomorphic(s1,s2));
    }
}