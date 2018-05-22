/*76. Minimum Window Substring
    
    Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

Example:

Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"

Note:

    If there is no such window in S that covers all characters in T, return the empty string "".
    If there is such window, you are guaranteed that there will always be only one unique minimum window in S.
    */

class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
      int[] counts = new int[256];
      for (char c : t.toCharArray()) {
        counts[c]++;
      }

      int start = 0;
      int end = 0;
      int minStart = 0;
      int minLen = Integer.MAX_VALUE;
      int counter = t.length();
      while (end < s.length()) {
        if (counts[s.charAt(end)] > 0) {
          counter--;
        }

        counts[s.charAt(end)]--;
        end++;

        while (counter == 0) {
          if (end - start < minLen) {
            minStart = start;
            minLen = end - start;
          }
          counts[s.charAt(start)]++;
          if (counts[s.charAt(start)] > 0) {
            counter++;
          }
          start++;
        }
      }

      if (minLen == Integer.MAX_VALUE) {
        return "";
      }
      return s.substring(minStart, minStart + minLen);
    }
  

       
     public static void main(String[] args)
    {
        String str1="ADOBECODEBANC";
        String str2="ABC";
    
     System.out.println(minWindow(str1,str2));
        

     }}

