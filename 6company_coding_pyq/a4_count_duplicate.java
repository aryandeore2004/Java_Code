public class a4_count_duplicate {

  public static void main(String[] args) {
    String str = "aryandeorea";
    int[] freq = new int[256];
    for(int i=0;i<str.length();i++){
      freq[str.charAt(i)]++;
    }
    for(int i=0;i<)
  }

}
// 🔹 Method 1: Using int[] freq (ASCII array)

// int[] freq = new int[256];
// for (int i = 0; i < str.length(); i++) { // count frequency
// freq[str.charAt(i)]++;
// }

// for (int i = 0; i < str.length(); i++) { // print duplicates
// char ch = str.charAt(i);
// if (freq[ch] > 1) {
// System.out.println(ch + " → " + freq[ch]);
// freq[ch] = 0;
// }
// }

// ⏱ Time Complexity

// Counting frequencies → O(n)

// Printing duplicates → O(n)
// ✅ Total = O(n)

// 💾 Space Complexity

// Extra space for int[256] → O(1) (constant, because 256 is fixed, independent
// of input size).

// 🔹 Method 2: Using Nested Loops (No Extra Array)
// for (int i = 0; i < str.length(); i++) {
// int count = 1;
// for (int j = i + 1; j < str.length(); j++) {
// if (str.charAt(i) == str.charAt(j)) {
// count++;
// }
// }
// if (count > 1) {
// System.out.println(str.charAt(i) + " → " + count);
// }
// }

// ⏱ Time Complexity

// Outer loop → runs n times

// Inner loop → runs up to n times
// ✅ Total = O(n²)

// 💾 Space Complexity

// Only a few variables (count, i, j) → O(1)
