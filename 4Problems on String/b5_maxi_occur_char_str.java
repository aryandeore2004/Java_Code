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
