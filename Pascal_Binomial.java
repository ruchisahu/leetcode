import java.util.*;
import java.util.ArrayList;

public class Pascal_Binomial
{
  public static List<List<Integer>> generate(int numRows) 
  {
    List<List<Integer>> result = new ArrayList<List<Integer>>(numRows);
    List<Integer> list;
    
    for(int n=0; n<numRows; n++){
        list = new ArrayList<Integer>(n+1);
        for(int k=0; k<=n; k++){
            if(k==0||k==n){
                list.add(1);
            }else{
                list.add(binomial(k,n));
            }
        }
        result.add(list);
    }
    
    return result;
}

public static int binomial(int k, int n){
    if (k > n/2) {
        k = n - k;
    }

    double denominator = 1.0, numerator = 1.0;
    for (int i = 1; i <= k; i++) {
        denominator *= i;
        numerator *= (n + 1 - i);
    }
    return (int)(numerator / denominator);
}

public static void print(int row) {  //others print values
  for (int n = 0; n < row; n++) {
   for (int k = 0; k <= n; k++) {
    System.out.print(nCk(n, k) + " ");
   }
   System.out.println();
  }
 }
 
 public static int nCk(int n, int k) {
  int numerator = fact(n);
  int denominator = fact(k) * fact(n - k);
  int result = (int) (numerator / denominator);
  return result;
 }
 
 public static int fact(int num) {
  int result = 1;
  for (int i = 1; i <= num; i++) {
   result = result * i;
  }
  return result;
}
 
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the maximum row number to process: ");
  int row = scanner.nextInt();
  print(row);
  System.out.print(generate(row));
 }
}