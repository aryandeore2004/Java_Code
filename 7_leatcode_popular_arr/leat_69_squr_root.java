
// LeetCode 69: Sqrt(x)
// Problem Statement

// Given a non-negative integer x, return the square root of x rounded down to the nearest integer.

// You must not use built-in functions such as:

// Math.sqrt(x)
// Example 1
// Input: x = 4

// Output: 2
// Example 2
// Input: x = 8

// Output: 2

// Explanation:

// √8 = 2.828...

// Rounded down = 2
// Optimal Approach: Binary Search ⭐
// Logic
// Search between 1 and x

// mid * mid == x → answer found

// mid * mid < x
//     move right

// mid * mid > x
//     move left

// Store last valid answer
// VS Code Code
public class leat_69_squr_root {
    public static void main(String[] args) {

        int x = 8;

        long low = 1;
        long high = x;
        int ans = 0;

        while(low <= high) {

            long mid = low + (high - low) / 2;

            if(mid * mid == x) {
                ans = (int) mid;
                break;
            }
            else if(mid * mid < x) {
                ans = (int) mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}


// DRY run

// x = 8

// | low | high | mid | mid² | Action           |
// | --- | ---- | --- | ---- | ---------------- |
// | 1   | 8    | 4   | 16   | high = 3         |
// | 1   | 3    | 2   | 4    | ans = 2, low = 3 |
// | 3   | 3    | 3   | 9    | high = 2         |


// class Solution {
//     public int mySqrt(int x) {
//        double res = Math.sqrt(x); 
//        return (int)res;
//     }
// }


//     public static void main(String[] args) {

//         int x = 8;
//         int ans = 0;

//         for(int i = 1; i <= x; i++) {

//             if((long)i * i <= x) {
//                 ans = i;
//             } else {
//                 break;
//             }
//         }

//         System.out.println(ans);
//     }
// }
// Output
// 2