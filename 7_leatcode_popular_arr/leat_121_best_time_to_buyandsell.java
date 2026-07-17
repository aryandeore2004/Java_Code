// LeetCode 121: Best Time to Buy and Sell Stock
// Problem Statement

// You are given an array prices where prices[i] is the price of a stock on the i-th day.

// You want to maximize your profit by choosing:

// One day to buy a stock, and
// A different future day to sell that stock.

// Return the maximum profit you can achieve from this transaction.

// If no profit can be made, return 0.

// Example 1
// Input: prices = [7,1,5,3,6,4]

// Output: 5

// Explanation:
// Buy on day 2 (price = 1)
// Sell on day 5 (price = 6)

// Profit = 6 - 1 = 5
// Example 2
// Input: prices = [7,6,4,3,1]

// Output: 0

// Explanation:
// No profitable transaction is possible.
// Constraints
// 1 <= prices.length <= 10^5
// 0 <= prices[i] <= 10^4
// Approaches
// Brute Force — O(n²)
// One Pass (Minimum Price) — O(n) ✅
// Kadane's Algorithm Variation — O(n)

public class leat_121_best_time_to_buyandsell {
  public static int maxProfit(int[] prices) {

    // Store the minimum stock price seen so far
    int minPrice = Integer.MAX_VALUE;

    // Store the maximum profit found so far
    int maxProfit = 0;

    // Traverse through all stock prices
    for (int i = 0; i < prices.length; i++) {

      // Update the minimum price if current price is smaller
      minPrice = Math.min(minPrice, prices[i]);

      // Calculate profit if we sell on the current day
      int currentProfit = prices[i] - minPrice;

      // Update maximum profit if current profit is greater
      maxProfit = Math.max(maxProfit, currentProfit);
    }

    // Return the maximum profit possible
    return maxProfit;
  }

  public static void main(String[] args) {

    int[] prices = { 7, 1, 5, 3, 6, 4 };

    System.out.println("Maximum Profit = " + maxProfit(prices));
  }
}

// public class leat_121_best_time_to_buyandsell {
//     public static void main(String[] args) {
//         // Input array containing stock prices
//         int[] prices = {7, 1, 5, 3, 6, 4};
//         // Initialize minimum price with first day's price
//         int minPrice = prices[0];
//         // Initialize maximum profit as 0
//         int maxProfit = 0;

//         // Traverse the array
//         for (int i = 1; i < prices.length; i++) {
//             // Update minimum price
//             if (prices[i] < minPrice) {
//                 minPrice = prices[i];
//             }

//             // Calculate current profit
//             int currentProfit = prices[i] - minPrice;
//             // Update maximum profit
//             if (currentProfit > maxProfit) {
//                 maxProfit = currentProfit;
//             }
//         }
//         // Print answer
//         System.out.println("Maximum Profit = " + maxProfit);
//     }
// }






// Dry Run
// prices = [7,1,5,3,6,4]

// Day 1: Price=7
// minPrice=7, profit=0, maxProfit=0

// Day 2: Price=1
// minPrice=1, profit=0, maxProfit=0

// Day 3: Price=5
// profit=5-1=4, maxProfit=4

// Day 4: Price=3
// profit=3-1=2, maxProfit=4

// Day 5: Price=6
// profit=6-1=5, maxProfit=5

// Day 6: Price=4
// profit=4-1=3, maxProfit=5

// Answer = 5

// Time Complexity: O(n)
// Space Complexity: O(1)

// For LeetCode 121: Best Time to Buy and Sell Stock, there are mainly 3
// approaches:

// 1. Brute Force — O(n²)

// Check every possible buy-sell pair.

// int maxProfit = 0;

// for(int i = 0; i < prices.length; i++) {
// for(int j = i + 1; j < prices.length; j++) {
// maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
// }
// }
// Time: O(n²)
// Space: O(1)
// 2. Track Minimum Price (Optimal) — O(n)
// int minPrice = Integer.MAX_VALUE;
// int maxProfit = 0;

// for(int price : prices) {
// minPrice = Math.min(minPrice, price);
// maxProfit = Math.max(maxProfit, price - minPrice);
// }

// return maxProfit;
// Time: O(n)
// Space: O(1)

// This is the most common interview solution.

// 3. Kadane's Algorithm Variation — O(n)

// Convert prices into daily profit/loss differences and find the maximum
// subarray.

// int maxCur = 0;
// int maxSoFar = 0;

// for(int i = 1; i < prices.length; i++) {
// maxCur = Math.max(0, maxCur + prices[i] - prices[i - 1]);
// maxSoFar = Math.max(maxSoFar, maxCur);
// }

// return maxSoFar;
// Time: O(n)
// Space: O(1)