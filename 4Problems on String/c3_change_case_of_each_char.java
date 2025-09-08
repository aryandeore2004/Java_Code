public class c3_change_case_of_each_char {

  public static String change(String str) {
    StringBuilder result = new StringBuilder();
    for (char ch : str.toCharArray()) {
      if (Character.isUpperCase(ch)) {
        result.append(Character.toLowerCase(ch));
      } else if (Character.isLowerCase(ch)) {
        result.append(Character.toUpperCase(ch));
      } else if (Character.isWhitespace(ch)) {
        result.append(ch);
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
    String input = "Aryan Rajendra Deore";
    System.out.println(change(input));
  }
}
