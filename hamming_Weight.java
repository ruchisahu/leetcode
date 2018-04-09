/*Write a function that takes an unsigned integer and returns the number of ’1' bits 
 * it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011,
so the function should return 3.


*/
public class hamming_Weight {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n)
    {
        int count=0;
        
       
        while(n!=0)
        {
          
            int x=n & 1;
            System.out.println(n);
            if(x==1)
                
                count++;
           
            n=n>>>1;   //n=n>>1 time limit exceed
            
        }

        return count;
    }
 public static void main(String[] arg)
    {
      System.out.println(hammingWeight(000111));
    }
}