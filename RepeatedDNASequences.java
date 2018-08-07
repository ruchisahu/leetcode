//187. Repeated DNA Sequences

/*All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

Example:

Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"

Output: ["AAAAACCCCC", "CCCCCAAAAA"]

*/

import java.util.ArrayList;
import java.util.List;
import java.util.*;
class RepeatedDNASequences
{
    public static List<String> findRepeatedDnaSequences(String s)
    {
        List<String> list=new ArrayList<String>();
         List<String> result=new ArrayList<String>();
        for(int i=0;i+9 <s.length();i++)
        {
            String temp=s.substring(i,i+10);
             System.out.println(temp);
             if(!list.contains(temp))
                 list.add(temp);
             else
                 result.add(temp);
                 
        }
        return result;
    }
    public static List<String> findRepeatedDnaSequences1(String s) {
    Set seen = new HashSet(), repeated = new HashSet();
    for (int i = 0; i + 9 < s.length(); i++) {
        String ten = s.substring(i, i + 10);
        if (!seen.add(ten))
            repeated.add(ten);
    }
    return new ArrayList(repeated);
}
    public static void main(String[] arg)
    {
       // String s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        String s="AAAAAAAAAAAA";
        System.out.println(findRepeatedDnaSequences1(s));
    }
}