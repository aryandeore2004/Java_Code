
// LeetCode 867: Transpose Matrix   (for sqare and not matrix also)

// Problem Statement

// Given a 2D integer array matrix, return the transpose of the matrix.

// Transpose means:

// matrix[i][j] becomes matrix[j][i]
// Example
// Input:

// 1 2 3
// 4 5 6
// 7 8 9

// Output:

// 1 4 7
// 2 5 8
// 3 6 9


// code for  (for sqare and not matrix also)
public class leat_867_transpose_matrix {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Dry Run

// Input:

// 1 2 3
// 4 5 6



// | matrix[i][j] | transpose[j][i] |
// | ------------ | --------------- |
// | 1            | transpose[0][0] |
// | 2            | transpose[1][0] |
// | 3            | transpose[2][0] |
// | 4            | transpose[0][1] |
// | 5            | transpose[1][1] |
// | 6            | transpose[2][1] |

// Output:

// 1 4
// 2 5
// 3 6



// Complexity
// Time  : O(rows × cols)
// Space : O(rows × cols)



// Other Approach (Square Matrix Only)
// For an n × n matrix:

// Swap matrix[i][j]
// with matrix[j][i]

// This performs transpose in-place.

// Time  : O(n²)
// Space : O(1)



// Pattern Recognition
// Matrix
// Rows become Columns
// Columns become Rows

// Think:
// transpose[j][i] = matrix[i][j]


// Easy Rule
// Transpose means:

// new[row][col]
//       ↓
// new[col][row]

// So:

// transpose[j][i] = matrix[i][j]

// Just swap row and column indices. That's the standard transpose formula