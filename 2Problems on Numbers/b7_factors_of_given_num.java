import java.util.*;;

public class b7_factors_of_given_num {

  public static void factors(int num) {
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    factors(a);
  }
}
