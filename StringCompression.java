/*443. String Compression
    Given an array of characters, compress it in-place.

The length after compression must always be smaller than or equal to the original array.

Every element of the array should be a character (not int) of length 1.

After you are done modifying the input array in-place, return the new length of the array.
*/
class StringCompression {
    
    public static int compress(char[] chars)
    {
    int count = 1; 
    int index = 0; 
    for (int i = 0; i < chars.length; i++) {
        while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
            count++; 
            i++; 
        }
        if (count == 1) {
            chars[index++] = chars[i]; 
        } else {
            chars[index++] = chars[i]; 
            String num = String.valueOf(count); 
            for (int j = 0; j < num.length(); j++) {
                chars[index++] = num.charAt(j); 
            }
        }
        count = 1; 
    }
    return index; 
}
    public static void main(String[] arg)
    {
         char[] a={'a','a','b','b','c','c','c'};
        
        System.out.println(compress(a));
    }
}