class is_Palindrome {
    public static boolean isPalindrome(int x) 
    {
        if (x < 0) return false;
       if (x == 0) return true;
        if (x < 10) return true;
        
       int rev=0;
        int x1=x;
        
        while(x1!=0)
        {

            rev=rev*10 + x1%10;
            System.out.println(rev);
            x1=x1/10;
        }
        if(x==rev)
            return true;
        else
        return false;
    }
    
    
   public static void main(String[] arg)
    {
        System.out.println(isPalindrome(10101000));
    }
}