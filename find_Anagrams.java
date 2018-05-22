/*438. Find All Anagrams in a String
    
    Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
*/
import java.util.*;
import java.util.HashMap;
class find_Anagrams
{
    public static List<Integer> findAnagrams2(String s, String t) {
        List<Integer> result = new LinkedList<Integer>();
        if(t.length()> s.length()) return result;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : t.toCharArray()){
          //  map.put(c, (map.getOrDefault(c) + 1));
             map.put(c, map.get(c) + 1);
        }
        int counter = map.size();
        
        int begin = 0, end = 0;
        int head = 0;
        int len = Integer.MAX_VALUE;
        
        
        while(end < s.length()){
            char c = s.charAt(end);
            if( map.containsKey(c) ){
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0) counter--;
            }
            end++;
            
            while(counter == 0){
                char tempc = s.charAt(begin);
                if(map.containsKey(tempc)){
                    map.put(tempc, map.get(tempc) + 1);
                    if(map.get(tempc) > 0){
                        counter++;
                    }
                }
                if(end-begin == t.length()){
                    result.add(begin);
                }
                begin++;
            }
            
        }
        return result;
    }
    public static List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> result=new ArrayList<Integer>();
        int len1=s.length();
         int len2=p.length();
         for(int i=0;i<=len1-len2;i++)
         {
             if(isAnagram(s.substring(i, i + len2),p))
             {
                 result.add(i);
             }
         }
        
        return result;
    }
     private static boolean isAnagram(String s, String p) 
     {
         int[] c= new int[26];
         int len1=s.length();
        
         for(int i=0;i<len1;i++)
         {
             c[s.charAt(i)-'a']++;
             c[p.charAt(i)-'a']--;
         }
         for(int j:c)
         {
             if(j!=0)
                 return false;
         }
         return true;
     }
     public static List<Integer> findAnagrams1(String s, String p) {
        int[] hash = new int[128];
        for(int i=0; i<p.length(); i++) {
            hash[p.charAt(i)] ++;
        }
        List<Integer> res = new ArrayList<Integer>();
        int start = 0;
        //The goal is to make sure the whole hash array is >= 0.
        //When hash[i] < 0, move start to get back to 0.
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            hash[c]--;
            while (hash[c]<0) {
              hash[s.charAt(start)]++;
                 System.out.println(hash[s.charAt(start)]);
                start++;
            }
            if (i-start +1 == p.length()) {
                System.out.println("res="+res.add(start));
                 System.out.println(s.substring(start,i+1));
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        String str1="cbaebabacd";
        String str2="abc";
      //  System.out.println( isAnagram(str1,str2));
       System.out.println(findAnagrams1(str1,str2));
        

    }}