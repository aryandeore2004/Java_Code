import java.util.Scanner;

public class c4_concate_two_string {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Taking input from user
    System.out.print("Enter first string: ");
    String str1 = sc.nextLine();

    System.out.print("Enter second string: ");
    String str2 = sc.nextLine();

    // Concatenation
    String result = str1 + str2; // or str1.concat(str2)

    System.out.println("Concatenated String: " + result);

    sc.close();
  }
}
