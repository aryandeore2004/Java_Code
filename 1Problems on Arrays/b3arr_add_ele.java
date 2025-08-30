// Example:
// Input: N = 5, array[] = {1,2,3,4,5}
// insertbeginning(6)
// insertending(7)
// insertatpos(8,4)
// Output: 6,1,2,8,3,4,5,7
// Explanation: 6 is added at the beginning and 7 is added at the end and 8 is added at position 4 
// Solution
// Disclaimer: Don't jump directly to the solution, try it out yourself first.

// Approach: The approach is very simple for all three insertions.

// Insertion at beginning 
// For inserting the element at the beginning we should first shift all elements of the array to left by 1 index and then insert an element at the 0th position


// public class b3arr_add_ele {

//     public static int[] insert_beg(int arr[], int n, int value) {
//         int newArr[] = new int[n + 1];
//         newArr[0] = value;
//         for (int i = 0; i < n; i++) {
//             newArr[i + 1] = arr[i];
//         }
//         return newArr;
//     }

//     public static void main(String[] args) {
//         int arr[] = {2, 45, 21, 11, 22, 4};
//         int n = arr.length;
//         int value = 40;

//         System.out.print("Original array: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         arr = insert_beg(arr, n, value);

//         System.out.println("\nNew array: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }



// import java.util.*;
// class b3arr_add_ele{
// static void insertatbegin(int[] arr,int n,int value)
// {
//     for(int i=n-1;i>=0;i--)
//     {
//         arr[i+1]=arr[i];
//     }
//     arr[0]=value;
// }
// public static void main(String args[])
// {
//     int n=8;
//     int arr[]={10,9,14,8,20,48,16,9,0};
//     int value=40;
//     System.out.println("Before inserting the value at beginning:");
//      for(int i=0;i<n;i++)
//     {
//         System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//     insertatbegin(arr,n,value);
//     System.out.println("After inserting the value at beginning:");
//     for(int i=0;i<=n;i++)
//     {
//         System.out.print(arr[i]+" ");
//     }
//     System.out.println();
    
// }
// }










// Insertion at Ending
// For adding the elements at the end, just add the element at the nth index.

// import java.util.*;
// class b3arr_add_ele{
// static void insertatbegin(int[] arr,int n,int value)
// {
//     for(int i=n-1;i>=0;i--)
//     {
//         arr[i+1]=arr[i];
//     }
//     arr[0]=value;
// }
// public static void main(String args[])
// {
//     int n=8;
//     int arr[]={10,9,14,8,20,48,16,9,0};
//     int value=40;
//     System.out.println("Before inserting the value at beginning:");
//      for(int i=0;i<n;i++)
//     {
//         System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//     insertatbegin(arr,n,value);
//     System.out.println("After inserting the value at beginning:");
//     for(int i=0;i<=n;i++)
//     {
//         System.out.print(arr[i]+" ");
//     }
//     System.out.println();
    
// }
// }







// Insertion at specific position
// For adding the element at a specific position, just shift array elements to right by one position, and after that add an element at the desired position.

import java.util.*;
class b3arr_add_ele{
static void insertatbegin(int[] arr,int n,int value,int pos)
{
    for(int i=n;i>=pos;i--)
    {
        arr[i]=arr[i-1];
    }
    arr[pos-1]=value;
}
public static void main(String args[])
{
    int n=8;
    int arr[]={10,9,14,8,20,48,16,9,0};
    int pos =2;
    int value=40;
    System.out.println("Before inserting the value at beginning:");
     for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    insertatbegin(arr,n,value,pos);
    System.out.println("After inserting the value at beginning:");
    for(int i=0;i<=n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    
}
}