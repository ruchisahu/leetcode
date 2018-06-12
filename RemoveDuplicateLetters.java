/*316. Remove Duplicate Letters
    
    Given a string which contains only lowercase letters, remove duplicate letters so that every letter appear once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.

Example 1:

Input: "bcabc"
Output: "abc"

*/
import java.util.*;
class  RemoveDuplicateLetters {
    public static String removeDuplicateLetters(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        int[] count = new int[26];
    char[] arr = s.toCharArray();
    for(char c : arr)
    {
        count[c-'a']++;
    }
    boolean[] visited=new boolean[26];
    for(char c : arr) 
    {
        count[c-'a']--;
        if(visited[c-'a'])
            continue;
        while(!stack.isEmpty()&&stack.peek()>c && count[stack.peek()-'a']>0)
        {
            visited[stack.peek()-'a'] = false;
            stack.pop();
        }
        stack.push(c);
        visited[c-'a'] = true;
        
    }
    
    StringBuilder sb = new StringBuilder();
    for(char c : stack)
    {
        sb.append(c);
    }
        return sb.toString();
    }
    public static void main(String[] arg)
    {
        String s="bcabc";
        System.out.println(removeDuplicateLetters(s));
    }
}
