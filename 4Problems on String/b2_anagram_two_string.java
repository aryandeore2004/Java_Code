
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



// import java.util.HashMap;

// public class Anagram {
//     public static boolean isAnagram(String s1, String s2) {
//         if (s1.length() != s2.length()) return false;

//         HashMap<Character, Integer> map = new HashMap<>();

//         // Step 1: count characters from s1
//         for (int i = 0; i < s1.length(); i++) {
//             char ch = s1.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         // Step 2: subtract using s2
//         for (int i = 0; i < s2.length(); i++) {
//             char ch = s2.charAt(i);

//             if (!map.containsKey(ch)) return false;

//             map.put(ch, map.get(ch) - 1);

//             if (map.get(ch) == 0) {
//                 map.remove(ch); // optional but clean
//             }
//         }

//         // Step 3: check empty map
//         return map.isEmpty();
//     }
// }