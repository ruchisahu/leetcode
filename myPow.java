/*
 * 50. Pow(x, n)
    Implement pow(x, n), which calculates x raised to the power n (xn).

Example 1:

Input: 2.00000, 10
Output: 1024.00000
*/    
    
class mypow { 
    public static double myPow(double x, int n)
    {
        if(n==0)
            return 1;
        if (x == 0) 
            return 0;
        
        if(n<0)
        {
            n = -n;
            x = 1/x;
        }
        double pow=1;
        while(n>0)
        {
            pow=pow*x;
            n--;
        }
        return pow;
    }
    public static double myPow1(double x, int n)  //recursive
    {
        if(x==0||n == 0)
            return 1;
        
        if (x == 0) 
            return 0;
        if(n<0){
         //  return 1/myPow(x,-n);
            if(n==Integer.MIN_VALUE){ 
            n = Integer.MAX_VALUE;
            if(x<0) x = -x;
        }
        else n = -n;
        x = 1/x;
        }
        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
    public double myPow2(double x, int n)      //correct sol
    {
    if(n == 0)
            return 1;

        if(n<0){
            
            if(n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE;
                if(x<0) x = -x;
            } else {
                n = -n;
            }
            x = 1/x;
        }
        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);   
    }
    public static void main(String[] arg)
    {
        double x=2.000000;
      //  System.out.println(myPow1(x,10));
         System.out.println(myPow1(x,-2));
    }
}