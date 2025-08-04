
import java.io.*;
public class a3second_max_min {
    
    public static int sec_greater(int arr1[]){
        int large = Integer.MIN_VALUE;
        int sec_large = Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>large){
                sec_large = large;
                large = arr1[i];
            }
            else if(arr1[i]!=large && arr1[i]>sec_large ){
                sec_large = arr1[i];
            }
        }
        return sec_large;
        
    }
    public static int sec_smaller(int arr1[]){
        int small = Integer.MAX_VALUE;
        int sec_small = Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<small){
                sec_small = small;
                small = arr1[i];
            }
            else if(arr1[i]!=small && arr1[i]<sec_small ){
                sec_small = arr1[i];
            }
        }
        return sec_small;
        
    }

    public static void main(String args[]){
        int[] arr1={54,12,32,45,105};
        System.out.println(sec_greater(arr1));
        System.out.println(sec_smaller(arr1));
    }
}


// Java program to find the second largest element in the array
// using two traversals

// import java.util.Arrays;

// class GfG {

//     // Function to find the second largest element in the array
//     static int getSecondLargest(int[] arr) {
//         int n = arr.length;

//         int largest = -1, secondLargest = -1;

//         // Finding the largest element
//         for (int i = 0; i < n; i++) {
//             if (arr[i] > largest)
//                 largest = arr[i];
//         }

//         // Finding the second largest element
//         for (int i = 0; i < n; i++) {
            
//             // Update second largest if the current element is greater
//             // than second largest and not equal to the largest

//             if (arr[i] > secondLargest && arr[i] != largest) {
//                 secondLargest = arr[i];
//             }
//         }
//         return secondLargest;
//     }

//     public static void main(String[] args) {
//         int[] arr = {12, 35, 1, 10, 34, 1};
//         System.out.println(getSecondLargest(arr));
//     }
// }