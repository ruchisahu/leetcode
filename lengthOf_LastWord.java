/*
 * 58. Length of Last Word
    
    Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Input: "Hello World"
Output: 5
*/
class lengthOf_LastWord {
    public static int lengthOfLastWord(String s)
    {
        if (s == null || s.length() == 0) {
                return 0;
            }
            s = s.trim();
            int len = s.length() - 1;
            while (len >= 0 && s.charAt(len) != ' ')
            {
                len--;
            }
            return s.length() - len - 1;
        
    }
    public static void main(String[] arg)
    {
        String s="hello world";
        System.out.println(lengthOfLastWord(s));
    }
}