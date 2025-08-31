
import java.util.Arrays;

public class b2_anagram_two_string {

  static boolean areAnagrams(String str1, String str2) {
    // If lengths differ, they can't be anagrams
    if (str1.length() != str2.length()) {
      return false;
    }

    // Convert to char array and sort
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    return Arrays.equals(arr1, arr2);
  }

  public static void main(String[] args) {
    String s1 = "listen";
    String s2 = "silent";

    if (areAnagrams(s1, s2))
      System.out.println("Anagrams");
    else
      System.out.println("Not Anagrams");
  }
}
