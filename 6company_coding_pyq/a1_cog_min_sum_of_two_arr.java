// 1. Minimum Sum
// Problem: You are given two integer arrays A and B of length N on which you have to perform below operation: In one operation, you can swap any two elements of 'A' or any two elements of 'B'

// Your task is to find and return an integer value representing the minimum possible sum of A[i]*B[i] after performing the above operation any number of times. Note: The operation can also be performed 0 number of times.

// Input Specification:

// input1: An integer value N representing the size of arrays.
// input2: An integer array A
// input3: An integer array B
// Output Specification: Return an integer value representing the minimum possible sum of A[i]*B[i] after performing the above operation any number of times.

// Example 1:

// input1: 4
// input2: {1,4,1,6}
// input3: {1,4,3,4}
// Output: 25
// Explanation: Here A = {1,4,3,2} and B = {1,4,3,4}. To minimize the sum, we can swap the first two elements of A i.e., 4 and 1. The array will now become (4,1,3,2). The sum obtained will be 25, which is the minimum. Hence, 25 is returned as the output.

// Example 2:

// input1: 3
// input2: (4,1,6)
// input3: (3,1,2)
// Output: 17
// Explanation: Here, A = (4,1,6) and B= (3,1,2). To minimize the sum, we can swap the first two elements of A. i.e., 4 and 1 and the last two elements of B i.e., 1 and 2. The array A and B will now become (1,4,6) and (3,2,1) respectively. The sum obtained will be 17, which is the minimum. Hence, 17 is returned as the output.

import java.util.*;

public class a1_cog_min_sum_of_two_arr {

    public static int summ(int[] arr1, int[] arr2, int n) {
        Arrays.sort(arr1); // ascending
        Arrays.sort(arr2); // ascending

        // Reverse arr2 to descending
        for (int i = 0; i < n / 2; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[n - 1 - i];
            arr2[n - 1 - i] = temp;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1[i] * arr2[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };
        int n = arr1.length;

        System.out.println(summ(arr1, arr2, n)); // Output: 28
    }
}

// def min_sum(A, B):
// # Sort A ascending
// A.sort()
// # Sort B descending
// B.sort(reverse=True)

// # Compute sum
// result = 0
// for i in range(len(A)):
// result += A[i] * B[i]
// return result

// # Example usage
// A = [1, 3, 5]
// B = [2, 4, 6]
// print("Minimum Sum =", min_sum(A, B))
