public class a4arr_reverse {

    static void print_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
    }

    public static void arr_reverse1(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println(arr[i]);

        }
    }

    public static void arr_reverse2(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        print_arr(arr);
    }

    public static void main(String arg[]) {
        int[] arr = { 12, 45, 6, 87, 65 };
        arr_reverse2(arr);
    }
}
