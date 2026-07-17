public class a4arr_reverse {

    static void print_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
    }

    public static void arr_reverse1(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println(arr[i]);

        }
    }

    // Two pointer
    public static void arr_reverse2(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        print_arr(arr);
    }

    // one pointer
    public static void arr_reverse3(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        print_arr(arr);
    }

    public static void main(String arg[]) {
        int[] arr = { 12, 45, 6, 87, 65 };
        arr_reverse3(arr);

    }
}

// import java.util.Stack;

// public class ReverseArray {
//     public static void main(String[] args) {

//         int[] arr = {1, 2, 3, 4, 5};

//         Stack<Integer> stack = new Stack<>();

//         // Step 1: Push all elements into stack
//         for (int num : arr) {
//             stack.push(num);
//         }

//         // Step 2: Pop elements back into array
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = stack.pop();
//         }

//         // Step 3: Print reversed array
//         System.out.print("Reversed Array: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }



// Array Reversal Approaches


// 1. Print Array in Reverse Order

// Traverse the array from the last index to the first index.
// Only displays elements in reverse order.
// Original array remains unchanged.

// Time Complexity: O(n)
// Space Complexity: O(1)

// Important Point: Reverse output is obtained, but the array is not actually reversed.




// 2. Two-Pointer Approach

// One pointer starts from the beginning.
// Another pointer starts from the end.
// Swap elements and move both pointers towards the center.

// Time Complexity: O(n)
// Space Complexity: O(1)

// Important Points:

// Most commonly asked interview solution.
// Reverses the array in-place.
// No extra memory required.
// Optimal solution.



// 3. One-Pointer Approach

// Iterate only until the middle of the array.
// Swap the current element with its corresponding element from the end.

// Time Complexity: O(n)
// Space Complexity: O(1)

// Important Points:

// Same efficiency as the two-pointer approach.
// Uses a single loop variable.
// Also performs in-place reversal.


// 4. Stack Approach

// Push all elements into a stack.
// Pop them back into the array.
// Stack follows LIFO (Last In, First Out), which automatically reverses the order.

// Time Complexity: O(n)
// Space Complexity: O(n)

// Important Points:

// Uses extra memory.
// Not the most efficient solution.
// Useful when practicing stack concepts or when specifically asked to use a stack.


// Comparison Table

// | Approach         | Time Complexity | Space Complexity | Array Modified |
// | ---------------- | --------------- | ---------------- | -------------- |
// | Print in Reverse | O(n)            | O(1)             | No             |
// | Two Pointers     | O(n)            | O(1)             | Yes            |
// | One Pointer      | O(n)            | O(1)             | Yes            |
// | Stack            | O(n)            | O(n)             | Yes            |
