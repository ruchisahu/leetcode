import java.util.*;
class countPrime
{
     public static int countPrimes(int n)
    {
         int count=0;
         for(int i=1;i<=n;i++)
         {
             if(isPrimes(i))
             {
                 System.out.println(i);
                 count++;
             }
                 
         } 
         return count;
    }
    public static boolean isPrimes(int number)
    {
        if (number == 2 || number == 3) {
            return true;
        }
      
        for (int i = 2; i <= number/2; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int countPrimes1(int n) 
    {
    
       if(n<=2) return 0;
        
         boolean[] prime=new boolean[n];
          for(int i=2;i<n;i++)
          {
              prime[i]=true;
          }
         int count=0;
         for(int i=2;i<n;i++)
         {
             if(isPrimes(i))
             {
                 
                for (int j = 2; j*i < n; j++) 
                {
                prime[j*i] = false;
                }
            }
                 
         } 
         for(int i=2;i<n;i++)
         {
              if(prime[i])
                  count++;
          }
        
         return count;
    } 
    
    public static void main(String[] args)
    {
        System.out.println(countPrimes1(499));
    }
}