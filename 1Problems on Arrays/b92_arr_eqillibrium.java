public class b92_arr_eqillibrium {

  public static int equillibrium_arr(int nums[]) {
    for (int i = 0; i < nums.length; i++) {
      int leftside = 0;
      for (int j = 0; j < i; j++) {
        leftside = leftside + nums[j];
      }
      int rightside = 0;
      for (int j = i + 1; j < nums.length; j++) {
        rightside = rightside + nums[j];
      }
      if (rightside == leftside) {
        return i;
      }

    }
    return -1;

  }

  public static void main(String[] args) {
    int nums[] = { 2, 3, -1, 8, 4 };
    int equilli = equillibrium_arr(nums);
    System.out.print(equilli);
  }
}
