public class a6arr_sum {
    public static void main(String arg[]){
        int arr[] = {5,2,1,3};
        int n = arr.length;
        System.out.println("Sum of arr element is "+sum_arr(arr, n));
    }

    public static int sum_arr(int arr[],int n){
        int sum =0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }

        return sum;
    }
}
