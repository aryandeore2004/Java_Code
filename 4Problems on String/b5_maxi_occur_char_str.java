import java.util.Scanner;

public class b5_maxi_occur_char_str {

  public static char max_char(String str) {

    int[] freq = new int[256];
    for (int i = 0; i < str.length(); i++) {
      freq[str.charAt(i)]++;
    }
    int max = -1;
    char result = ' ';
    for (int i = 0; i < str.length(); i++) {

      if (freq[str.charAt(i)] > max) {
        max = freq[str.charAt(i)];
        result = str.charAt(i);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("Maximum occuring character is : " + max_char(str));

  }
}

// Step 1: Frequency Array

// We create an array of size 256 → int[] freq = new int[256];
// This is because every character (ASCII value) can be used as an index.

// At the start → all values are 0.

// Step 2: Count Frequency

// We loop through each character of "takeuforward" and increase its count:

// 't' → freq['t'] = 1

// 'a' → freq['a'] = 1

// 'k' → freq['k'] = 1

// 'e' → freq['e'] = 1

// 'u' → freq['u'] = 1

// 'f' → freq['f'] = 1

// 'o' → freq['o'] = 1

// 'r' → freq['r'] = 1

// 'w' → freq['w'] = 1

// 'a' again → freq['a'] = 2

// 'r' again → freq['r'] = 2

// 'd' → freq['d'] = 1

// So the final frequency counts look like:

// a → 2
// r → 2
// t → 1
// k → 1
// e → 1
// u → 1
// f → 1
// o → 1
// w → 1
// d → 1

// Step 3: Find Maximum

// Now we traverse the string again:

// 't' → count = 1 → max = 1, result = 't'

// 'a' → count = 2 → max = 2, result = 'a'

// 'k' → count = 1 (smaller than 2) → skip

// 'e' → count = 1 (skip)

// 'u' → count = 1 (skip)

// 'f' → count = 1 (skip)

// 'o' → count = 1 (skip)

// 'r' → count = 2 (equal to max → we keep first one, 'a')

// 'w' → count = 1 (skip)

// 'a' → count = 2 (equal → skip)

// 'r' → count = 2 (equal → skip)

// 'd' → count = 1 (skip)

// 👉 Maximum is 2, and the first character that reached it was 'a'.

// Step 4: Output
// Maximum occurring character: a

// ✅ So the logic is:

// Count frequency of all characters.

// Traverse string again and track the character with max frequency.

// Return the result.
