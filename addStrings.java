/*415. Add Strings
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

    The length of both num1 and num2 is < 5100.
    Both num1 and num2 contains only digits 0-9.
    Both num1 and num2 does not contain any leading zero.
    You must not use any built-in BigInteger library or convert the inputs to integer directly.
    */


public class addStrings
{
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry == 1) {
            int a = i >= 0 ? (num1Array[i--] - '0') : 0;     //use of '0'
             System.out.println(a);
            int b = j >= 0 ? (num2Array[j--] - '0') : 0;
             System.out.println(b);
            int sum = a + b + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }
        return sb.toString();
    }
    
    public static String addStrings1(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(num1.length(), num2.length());
        int carry = 0;
        for(int i=1; i<=maxLength; i++){
            int val = carry;
            if(i<=num1.length()) val += num1.charAt(num1.length()-i)-'0';
            if(i<=num2.length()) val += num2.charAt(num2.length()-i)-'0';
            result.append(val%10);
            carry = val/10;
        }
        if(carry>0)
            result.append(carry);
        return result.reverse().toString();
    }
    public String addStrings2(String num1, String num2) {
        String res = "";
        for (int carry = 0, i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; --i, --j) {
            int temp = (i < 0 ? 0 : num1.charAt(i) - '0') + (j < 0 ? 0 : num2.charAt(j) - '0') + carry;
            res = temp % 10 + res;
            carry = temp / 10; }
        return res;
}
    public static void main(String[] arg)
    {
        String str1="0010";
        String str2="0101";
       
         
        System.out.println(addStrings(str1, str2));
    }
}