import java.util.*;

public class b91_sortEle_freq {
  // Function to swap elements
  public static void swap(int[][] arr, int i, int j) {
    int temp1 = arr[0][i];
    arr[0][i] = arr[0][j];
    arr[0][j] = temp1;

    int temp2 = arr[1][i];
    arr[1][i] = arr[1][j];
    arr[1][j] = temp2;
  }

  // Function to sort 2d array by frequency
  public static void sort2darray(int[][] array2d, int k) {
    for (int i = 0; i < k - 1; i++) {
      for (int j = 0; j < k - 1 - i; j++) {
        if (array2d[1][j] < array2d[1][j + 1]) {
          swap(array2d, j, j + 1);
        }
      }
    }
  }

  // Function to sort elements of array by frequency
  public static void Sortele(int[] arr, int n) {
    // Step 1: Sort the array
    Arrays.sort(arr, 0, n);
    // Step 2: Create a 2d array
    int[][] arr2d = new int[2][100];
    int k = 0;
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (i == 0) {
        arr2d[0][k] = arr[i];
        count = 1;
      } else if (arr[i] == arr[i - 1]) {
        count++;
      } else {
        arr2d[1][k] = count;
        count = 1;
        k++;
        arr2d[0][k] = arr[i];
      }
    }
    arr2d[1][k] = count;
    k++;

    // Step 3: sort the 2d array according to frequency
    sort2darray(arr2d, k);

    // Step 4: Store the answer in original array
    k = 0;
    int i = 0;
    while (i < n) {
      while (arr2d[1][k] > 0) {
        arr[i] = arr2d[0][k];
        i++;
        arr2d[1][k]--;
      }
      k++;
    }
  }

  public static void main(String args[]) {
    int n = 8;
    int[] arr = { 1, 2, 3, 2, 4, 3, 1, 2 };
    Sortele(arr, n);
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
// Output:

// 2 2 2 1 1 3 3 4

// Time Complexity: O(n^2)

// Space Complexity: O(n)

// ***************************************************************************************************

// Solution 2: Optimal Approach (using hashing and sorting)

// Approach:

// STEP 1: Just store all elements on a map according to their count.

// STEP 2: Store all elements of the map in a vector one by one.

// STEP 3: Sort that vector according to its frequency.

// STEP 4: Now print them or push them into the answer vector.

// Code:

// import java.util.*;
// class b91_sortEle_freq{
// int first;
// int second;
// Pair(int first,int second)
// {
// this.first=first;
// this.second=second;
// }
// Pair()
// {

// }
// }
// class TUF{
// static void Sortelementsbyfreq(int arr[], int n)
// {
// HashMap<Integer, Integer> map=new HashMap<>();
// for (int i = 0; i < n; i++)
// {

// map.put(arr[i],map.getOrDefault(arr[i],0)+1);
// }
// ArrayList<Pair> vec=new ArrayList<>();
// for (int x:map.keySet())
// {
// vec.add(new Pair(x,map.get(x)));
// }
// Collections.sort(vec,(a,b)->{
// if(a.second==b.second)
// return a.first-b.first;
// else
// return b.second-a.second;
// });
// for (int i = 0; i < vec.size(); i++)
// {
// while (vec.get(i).second > 0)
// {
// System.out.print(vec.get(i).first+" ");
// vec.get(i).second--;
// }
// }

// }
// public static void main(String args[])
// {
// int arr[] = {3, 3, 5, 2, 1, 1, 2};
// int n = 7;
// Sortelementsbyfreq(arr, n);

// }
// }

// Output: 1 1 2 2 3 3 5

// Time Complexity - O(N) where N is the number of elements in the array

// Space Complexity - O(N) for storing the elements in Map, vector