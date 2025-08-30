import java.util.*;

public class b1_reverse_num {

  public static void reverses(int num) {
    int reverse = 0;
    while (num != 0) {
      int digit = num % 10;

      reverse = reverse * 10 + digit;
      num = num / 10;
    }
    System.out.println("The rever number is " + reverse);

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    reverses(num);

  }
}
