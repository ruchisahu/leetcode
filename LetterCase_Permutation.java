/*784. Letter Case Permutation
Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.

Examples:
Input: S = "a1b2"
Output: ["a1b2", "a1B2", "A1b2", "A1B2"]

Input: S = "3z4"
Output: ["3z4", "3Z4"]

Input: S = "12345"
Output: ["12345"]

Note:

    S will be a string with length at most 12.
    S will consist only of letters or digits.
    
    */

import java.util.*;    
class LetterCase_Permutation
{
     public List<String> ans;
    public List<String> letterCasePermutation(String s) 
        
    {
        ans= new ArrayList<String>();
        helper(s.toCharArray(), 0);
        return ans;
    }
    private void helper(char[] S, int i) {
    if (i == S.length) {
      ans.add(new String(S));
    }
      else
      {
        if(Character.isDigit(S[i])) helper(S,i+1);
        else
        {
            S[i]=Character.toLowerCase(S[i]);
            helper(S,i+1);
             S[i]=Character.toUpperCase(S[i]);
              helper(S,i+1);
        }
      }
      
    }    
    public static void main(String[] arg)
    {
        LetterCase_Permutation l= new LetterCase_Permutation();
        String s="a1b2";
        System.out.println(l.letterCasePermutation(s)) ;
    }
}