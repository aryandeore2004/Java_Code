
// Count the number of words in a given string

// public class c2_word_count {

//   public static int count(String str) {
//     String str_arr[] = str.trim().split("\\s+");
//     return str_arr.length;
//   }

//   public static void main(String[] args) {
//     System.out.println(count("aryan is good"));
//   }
// }

class c2_word_count {

  // Driver code
  public static void main(String[] args) {
    String str = "HI AMY AND JAY";
    int n = str.length();
    int spaces = 0;

    for (int i = 0; i < n; i++) {
      if (str.charAt(i) == ' ')
        spaces = spaces + 1;
    }

    System.out.print("Number of words are ");
    System.out.print(spaces + 1);
  }
}

// Time Complexity: O(N)

// Reason: We iterate for the length of the string

// Space Complexity: O(1)

// Reason: We are not using any extra space.