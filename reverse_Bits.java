public class reverse_Bits {
    // you need treat n as an unsigned value
    public static int reverseBits(int x) 
      {
        int res=0;
        for(int i=0;i<32;i++)
        {
            res=res<<1;
            res|=(x>>i)&1;
        }

return res;

      }  
    public static void main(String[] arg)
    {
        int x=000001;
        System.out.println(reverseBits(x));
    }
}