// 2. Magical Library
// Problem: In a magical library, each bookshelf is represented by a two-dimensional array A, where each row of the 2D array A[i] represents the series value of a book.

// A row is considered magical if the sum of the odd values of the series of a book is even. Your task is to find and return an integer value representing the number of magical rows.

// Input Specification:

// input1: An integer value representing the number of rows in the 2D array.
// input2: An integer value representing the number of columns in the 2D array.
// input3: A 2D integer array where each row represents a series of books.
// Output Specification:
// Return an integer value representing the number of magical rows.

// Example 1:

// input1: 3
// input2: 3
// input3: ((1, 2, 3), (4, 5, 6), (7, 8, 9))
// Output: 2
// Explanation: Here, the given 2D array is {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}

// In the first row {1, 2, 3} the odd numbers are {1, 3} and their sum is 4 which is even.
// In the second row {4, 5, 6} the odd numbers are {5} and as there is only one odd element so the sum is 5 which is odd.
// In the third row {7, 8, 9} the odd numbers are {7, 9} and their sum is 16 which is even.
// Therefore, there are only 2 magical rows so, 2 is returned as the output.

// Example 2:

// input1: 3
// input2: 2
// input3: {{2, 4}, {0, 0}, {11, 11}}
// Output: 1
// Explanation: Here, the given 2D given array {{2, 4}, {0, 0}, {11, 11}}, Only the last row {11, 11} has odd elements and their sum is 22 which is even. Therefore, there is only 1 magical row so, 1 is returned as the output.

public class a2_cog_magical_library {

  public static int magical_count(int[][] arr, int row, int col) {
    int count = 0;

    for (int i = 0; i < row; i++) {
      int oddSum = 0;

      // check each element in row
      for (int j = 0; j < col; j++) {
        if (arr[i][j] % 2 != 0) { // odd element
          oddSum += arr[i][j];
        }
      }

      // if sum of odd elements is even
      if (oddSum % 2 == 0 && oddSum != 0) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[][] arr1 = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    int row = arr1.length;
    int col = arr1[0].length;
    System.out.println(magical_count(arr1, row, col));
  }
}

// def count_magical_rows(arr, rows, cols):
// count = 0

// for i in range(rows):
// odd_sum = 0
// for j in range(cols):
// if arr[i][j] % 2 != 0: # check if odd
// odd_sum += arr[i][j]

// # row is magical if odd sum is even and not zero
// if odd_sum != 0 and odd_sum % 2 == 0:
// count += 1

// return count

// # Example 1
// arr1 = [
// [1, 2, 3],
// [4, 5, 6],
// [7, 8, 9]
// ]
// print(count_magical_rows(arr1, 3, 3)) # Output: 2