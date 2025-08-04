public class a9_ap {
  public static void main(String args[]) {

    int a = 2, d = 2, n = 4;
    int ap = 0;
    for (int i = 0; i < n; i++) {
      ap = ap + a;
      a = a + d;
    }
    System.out.println(ap);

  }
}