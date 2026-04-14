// 🟦 Problem Statement

// Sarah has a box containing N chocolates. She decides to distribute the chocolates between Bob and Alice.

// Bob receives x chocolates

// Alice receives the remaining y chocolates, where x + y = N

// Bob and Alice start fighting over the chocolates, so Sarah introduces a game with the following rules:

// If Bob has more chocolates than Alice (x > y), Bob puts y chocolates into the box and Bob is left with x − y chocolates.

// If Alice has more chocolates than Bob (y > x), Alice puts x chocolates into the box and Alice is left with y − x chocolates.

// This process is repeated until either:

// One of them is left with 0 chocolates, or

// Both Bob and Alice have the same number of chocolates.

// 🔹 Task

// Determine the total number of chocolates collected in the box when the game ends.

// 🟦 Example
// Sample Input
// 11 4

// Explanation

// Total chocolates = 11

// Bob gets 4 chocolates

// Alice gets 7 chocolates

// Box initially has 0 chocolates

// Bob (x)	Alice (y)	Box (B)
// 4	7	0
// 4	3	4
// 1	3	7
// 1	2	8
// 1	1	9

// The game stops when both Bob and Alice have the same number of chocolates.

// Sample Output
// 9

import java.util.*;

public class delloite2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt(); // Alice
        int x = sc.nextInt(); // Bob

        int box = 0;

        while (x != 0 && y != 0 && x != y) {
            if (x > y) {
                x = x - y;
                box += y;
            } else {
                y = y - x;
                box += x;
            }
        }

        System.out.println(box);
        sc.close();
    }
}
