
import java.util.*;

public class b2_min_max_in_number {

  public static void min_max(int num) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    while (num != 0) {
      int digit = num % 10;

      if (min > digit) {
        min = digit;
      }
      if (max < digit) {
        max = digit;
      }
      num = num / 10;
    }
    System.out.println("The min digit in number is " + min);
    System.out.println("The max digit in number is " + max);

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    min_max(num);

  }
}

// import java.io.*;
// class Test
// {
// static private void MinMax(int n)
// {
// int d;
// int mini = Integer.MAX_VALUE;
// int maxi = Integer.MIN_VALUE;
// while (n != 0)
// {
// d = n % 10;
// mini = Math.min(mini,d);
// maxi = Math.max(maxi,d);
// n = n / 10;
// }

// System.out.println("The minimum number is: "+mini);
// System.out.print("The maximum number is: "+maxi);
// }
// public static void main(String[] args)
// {
// int n = 4726;
// MinMax(n);
// }
// }