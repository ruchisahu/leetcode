class Max_sum
{
    public static int sum(int[] arr)
    {
    int n=arr.length;
    int sum;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<n-1;i++)
    {
        sum=0;
        for(int j=i;j<n;j++)
        {
            
        sum=sum+arr[j];
         //   sum=Math.max(sum,sum+arr[i]);
        if(sum>maxsum) maxsum=sum;
        }
    }
        return maxsum;
    
    }
    
   
         public static int MaximumSum(int[] A, int left, int right)
    {
        // If array contains only one element
        if (right == left) {
            return A[left];
        }

        // Find middle element of the array
        int mid = (left + right) / 2;

        // Find maximum subarray sum for the left subarray
        // including the middle element
        int leftMax = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--)
        {
            sum += A[i];
            if (sum > leftMax) {
                leftMax = sum;
            }
        }

        // Find maximum subarray sum for the right subarray
        // excluding the middle element
        int rightMax = Integer.MIN_VALUE;
        sum = 0;    // reset sum to 0
        for (int i = mid + 1; i <= right; i++)
        {
            sum += A[i];
            if (sum > rightMax) {
                rightMax = sum;
            }
        }

        // Recursively find the maximum subarray sum for left subarray
        // and right subarray and tale maximum
        int maxLeftRight = Math.max(MaximumSum(A, left, mid), MaximumSum(A, mid + 1, right));

        // return maximum of the three
        return Math.max(maxLeftRight, leftMax + rightMax);
    }

    
    public static void main(String[] args)
    {
        int[] arr= { 2, -4, 1,5, 9, -6, 7, -3 };
        System.out.println(sum(arr));
       //  System.out.println(sum_devide_conquer(int[] arr));
        System.out.println("The Maximum sum of the subarray is " +
                MaximumSum(arr, 0, arr.length - 1));
    }
}