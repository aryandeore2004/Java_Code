public class a91_gp {

  public static void main(String args[]) {

    int a = 3, r = 5, n = 2;
    int gp = 0;
    for (int i = 0; i < n; i++) {
      gp = gp + a;
      a = a * r;
    }
    System.out.println(gp);

  }
}
