/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Note:

All given inputs are in lowercase letters a-z.

*/
class longest_CommonPrefix
{
public static String longestCommonPrefix(String[] strs) {
    if(strs==null || strs.length==0){
        return "";
    }
 
    if(strs.length==1) 
        return strs[0];
 
    int minLen = strs.length+1;
 
    for(String str: strs){
        if(minLen > str.length()){
            minLen = str.length();
        }
    }
 
    for(int i=0; i<minLen; i++){
        for(int j=0; j<strs.length-1; j++)
        {
            String s1 = strs[j];
            String s2 = strs[j+1];
            if(s1.charAt(i)!=s2.charAt(i))
            {
                System.out.println(s1.substring(0,i));
                return s1.substring(0, i);
            }
        }
    }
 
    return strs[0].substring(0, minLen);
}

public static String longestCommonPrefix1(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    for (int i = 0; i < strs[0].length() ; i++){
        char c = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j ++) {
            if (i == strs[j].length() || strs[j].charAt(i) != c)
                return strs[0].substring(0, i);             
        }
        System.out.println("str"+strs[0]);
    }
    return strs[0];
}
public static void main(String[] arg)
{
    String[] s={"bda","vda","aa"};
    System.out.println(longestCommonPrefix1(s)); 
}
}