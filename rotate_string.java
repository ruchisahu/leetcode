/**Rotate String(796)
 We are given two strings, A and B.

A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. 
Return True if and only if A can become B after some number of shifts on A. **/

class rotateString {
    public static boolean rotateString(String A, String B) 
    {
        int n=A.length();
        if(n==0 && B.length()==0) return true;
        if(A.length()!=B.length()) return false;
        if(n<1)return false;
        String temp=A+A;
       // System.out.println(temp);
        if(temp.contains(B)) return true;
        return false;
    }
    public static void main(String[] args)
    {
        String A = "abcde";
        String B = "cdeab";
        System.out.println(rotateString(A,B));
    }
}