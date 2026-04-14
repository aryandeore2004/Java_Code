public class a5_string_number_adition {
  public static void main(String[] args) {
    String str = "a12b3c45";
    int sum = 0;
    StringBuilder temp = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (ch >= '0' && ch <= '9') { // if (Character.isDigit(ch))
        temp.append(ch);
      } else {
        if (temp.length() > 0) {
          sum += Integer.parseInt(temp.toString());
          temp.setLength(0);
        }
      }
    }

    // add last number if any
    if (temp.length() > 0) {
      sum += Integer.parseInt(temp.toString());
    }
    System.out.println("Sum of numbers: " + sum);
  }
}

// 🔎 Dry Run (step by step)
// Initial values:
// sum = 0
// temp = ""

// i = 0 → ch = 'a' (not digit)

// temp.length() == 0 → nothing to add.
// 👉 sum = 0, temp = "".

// i = 1 → ch = '1' (digit)

// temp.append('1') → temp = "1".

// i = 2 → ch = '2' (digit)

// temp.append('2') → temp = "12".

// i = 3 → ch = 'b' (not digit)

// temp.length() > 0 → sum += Integer.parseInt("12") → sum = 12.

// Clear temp → temp = "".

// i = 4 → ch = '3' (digit)

// temp.append('3') → temp = "3".

// i = 5 → ch = 'c' (not digit)

// temp.length() > 0 → sum += Integer.parseInt("3") → sum = 15.

// Clear temp → temp = "".

// i = 6 → ch = '4' (digit)

// temp.append('4') → temp = "4".

// i = 7 → ch = '5' (digit)

// temp.append('5') → temp = "45".

// s = "a12b3c45"
// sum_val = 0
// temp = ""

// for ch in s:
// if ch.isdigit():
// temp += ch # build number
// else:
// if temp != "":
// sum_val += int(temp)
// temp = ""
// # Add last number
// if temp != "":
// sum_val += int(temp)

// print("Sum of numbers:", sum_val)