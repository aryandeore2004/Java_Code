


// import java.util.Arrays;

// public class b4_reapeat_ele_arr
// {
// 	static void findRepeatingElements(int arr[]) {
// 	    Arrays.sort(arr);
	    
// 	    System.out.print("The repeating elements are: ");
// 	    for(int i=0;i<arr.length-1;i++) 
// 	        if(arr[i] == arr[i+1])
// 	            System.out.print(arr[i]+" ");
// 	}
// 	public static void main(String[] args) {
// 		int[] arr = {1,1,2,3,4,4,5,2};
// 		findRepeatingElements(arr);
// 	}
// }
// Output:

// The repeating elements are: 1 2 4

// Time Complexity: O(NlogN)+O(N)

// Reason: O(NlogN) for sorting. O(N) for iterating again in the array for finding a loop.

// Space Complexity: O(1)

// Reason: No extra spaces are used.




public class b4_reapeat_ele_arr
{
	static void findRepeatingElements(int arr[]) {
	    int cnt = 0;
	    int[] dup = new int[arr.length];
	    for(int i=0;i<arr.length-1;i++) {
	        for(int j=i+1;j<arr.length;j++) {
	            if(arr[i]==arr[j]) dup[cnt++] = arr[i];
	        }
	    }
	    System.out.print("The repeating elements are: ");
	    for(int i=0;i<cnt;i++) 
	        if(dup[i] != dup[i+1]) System.out.print(dup[i]+" ");
	}
	public static void main(String[] args) {
		int[] arr = {1,1,2,3,4,4,5,2};
		findRepeatingElements(arr);
	}
}
// Output:

// The repeating elements are: 1 2 4

// Time Complexity: O(N2)+O(N)

// Reason: We are taking one element and searching its repeating element again in the array. Also, iterating through the dup array which contains repeating elements to find unique repeating elements.

// Space Complexity: O(N)

// Reason: We are using an array for storing all repeating elements.