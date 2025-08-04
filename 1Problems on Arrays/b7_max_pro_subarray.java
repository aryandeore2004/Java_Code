import java.util.*;

public class b7_max_pro_subarray {

  public static int maxProductSubArray(int nums[]) {

    int result = Integer.MIN_VALUE;
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int prod = 1;
        for (int k = i; k <= j; k++) {
          prod *= nums[k];
          result = Math.max(prod, result);
        }

      }
    }
    return result;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 2, -3, 0, -4, -5 };
    int answer = maxProductSubArray(nums);
    System.out.print("The maximum product subarray is: " + answer);
  }
}

// import java.util.*;
// public class Main
// {
// static int maxProductSubArray(int arr[]) {
// int prod1 = arr[0],prod2 = arr[0],result = arr[0];

// for(int i=1;i<arr.length;i++) {
// int temp = Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
// prod2 = Math.min(arr[i],Math.min(prod1*arr[i],prod2*arr[i]));
// prod1 = temp;

// result = Math.max(result,prod1);
// }

// return result;
// }
// public static void main(String[] args) {
// int nums[] = {1,2,-3,0,-4,-5};
// int answer = maxProductSubArray(nums);
// System.out.print("The maximum product subarray is: "+answer);
// }
// }
