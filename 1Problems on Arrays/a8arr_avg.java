public class a8arr_avg {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.println("Average = " + avg);
    }
}


// 2. Using Java Streams (Java 8+)
// Idea
// Convert the array into a stream.
// Use the built-in average() method.
// Code
// import java.util.Arrays;

// public class ArrayAverage {

//     public static void main(String[] args) {

//         int arr[] = {10, 20, 30, 40, 50};

//         double avg = Arrays.stream(arr)
//                            .average()
//                            .orElse(0);

//         System.out.println("Average = " + avg);
//     }
// }
// Output
// Average = 30.0
// Complexity
// Time: O(n)
// Space: O(1)
// Advantages
// Short and clean code.
// Uses Java's built-in API