import java.util.*;

// Given arr1[] and arr2[], we need to find whether arr1[] is a subset of arr2[]. An array is called a subset of another if all of its elements are present in the other array.

// * * * * 
// * * *
// * *
// *
public class a0_java {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows : ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < i + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
