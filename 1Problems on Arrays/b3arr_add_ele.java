
public class b3arr_add_ele {

// 1. Insert at Beginning

// Approach
// Create a new array of size n + 1.
// Store the new element at index 0.
// Copy all existing elements starting from index 1.

// Time Complexity
// O(n)

// Space Complexity
// O(n)
// Code

public static int[] insertAtBeginning(int[] arr, int num) {

    int[] arr2 = new int[arr.length + 1];

    arr2[0] = num;

    for (int i = 1; i < arr2.length; i++) {
        arr2[i] = arr[i - 1];
    }

    return arr2;
}



// 2. Insert at End

// Approach
// Create a new array of size n + 1.
// Copy all elements.
// Insert the new element at the last index.

// Time Complexity
// O(n)

// Space Complexity
// O(n)

// Code
public static int[] insertAtEnd(int[] arr, int num) {

    int[] arr2 = new int[arr.length + 1];

    for (int i = 0; i < arr.length; i++) {
        arr2[i] = arr[i];
    }

    arr2[arr.length] = num;

    return arr2;
}




// 3. Insert at Any Position

// Suppose

// Position = 4
// Element = 8

// Array

// 1 2 3 4 5

// Result
// 1 2 3 8 4 5

// Approach
// Copy elements before the position.
// Insert the new element.
// Copy the remaining elements.

// Time Complexity
// O(n)

// Space Complexity
// O(n)

// Code
public static int[] insertAtPosition(int[] arr, int pos, int num) {

    int[] arr2 = new int[arr.length + 1];

    for (int i = 0; i < pos - 1; i++) {
        arr2[i] = arr[i];
    }

    arr2[pos - 1] = num;

    for (int i = pos; i < arr2.length; i++) {
        arr2[i] = arr[i - 1];
    }

    return arr2;
}
// Main Method
public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5};

    arr = insertAtBeginning(arr, 6);

    arr = insertAtEnd(arr, 7);

    arr = insertAtPosition(arr, 4, 8);

    for (int num : arr) {
        System.out.print(num + " ");
    }
}

// Output
// 6 1 2 8 3 4 5 7
}