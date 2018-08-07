/*520. Detect Capital
     Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

    All letters in this word are capitals, like "USA".
    All letters in this word are not capitals, like "leetcode".
    Only the first letter in this word is capital if it has more than one letter, like "Google".

Otherwise, we define that this word doesn't use capitals in a right way. 
    Input: "USA"
Output: True
    
    */
    class detectCapitalUse {
    public static boolean detectCapitalUse(String word)
    {
         System.out.println(word.substring(1));
        return word.substring(1).equals(word.substring(1).toLowerCase())||word.equals(word.toUpperCase());
           
    }
    public static void main(String[] arg)
    {
        String s="g";
        System.out.println(detectCapitalUse(s));
    }
}