
import java.util.*;

public class a1_pallindrome {

  public static void palli(String str){
    str = str.toLowerCase();
    int left = 0;
    int right = str.length()-1;
    while(right>left){
      if(str.charAt(right)!=str.charAt(left)){
        System.out.println("This is not pallindrome");
        return;
      }
      right--;
      left++;
    }
    System.out.println("Palindrome");
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        palli(input);
        
  }
}
// Time Complexity: O(n)

// Space Complexity: O(1) (much more efficient than the reverse-string method).



//************************************************************************************************************************************************ */

// import java.util.*;

// public class PalindromeCheck1 {

//     public static void main(String[] args) {
//         // Create Scanner object to take input from user
//         Scanner sc = new Scanner(System.in);

//         // Ask user to enter a string
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

//         // Reverse the string using StringBuilder's reverse() method
//         String reversed = new StringBuilder(str).reverse().toString();

//         // Compare the original and reversed strings
//         if (str.equals(reversed)) {
//             System.out.println("Palindrome"); // Both match => It's a palindrome
//         } else {
//             System.out.println("Not a palindrome"); // Mismatch => Not a palindrome
//         }

//         // Close the scanner to avoid resource leak
//         sc.close();
//     }
// }




// Time Complexity: O(n)

// Space Complexity: O(n)