public class b5_non_repeat_ele_arr {

    public static void nonRepeat_ele(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 1, 2, 5,12, 8, 2, 8,17};
        int n = arr.length;
        System.out.print("Non-repeating elements: ");
        nonRepeat_ele(arr, n);
    }
}
