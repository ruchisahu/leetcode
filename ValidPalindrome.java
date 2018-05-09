class ValidPalindrome {
   public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        s = s.toLowerCase();
        while (i < j){
            while (i < j && !isValidChar(s.charAt(i))) i++;
            while (i < j && !isValidChar(s.charAt(j))) j--;
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
   static  boolean isValidChar(char c){
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
    public boolean isPalindrome1(String s) 
    {
      int i = 0;
    int j = s.length()- 1;
    char[] s1=s.toCharArray();
    while (i <= j) {
        while (!isValidChar(s1[i]))
       {
            System.out.println("i:"+s1[i]);
           i++;
       }
        while(!isValidChar(s1[j]))
        {
             System.out.println("j:"+s1[i]);
            j--;
        }
   
        if (i < j &&(s1[i++]) !=(s1[j--])) 
            return false;
    }
    
    return true;
    
    }
    public static void main(String[] arg)
    {
        String s="race a car";
      //  String s="A man, a plan, a canal: Panama";
        String s1=s.toUpperCase();
        System.out.println(isPalindrome(s1));
    }
}