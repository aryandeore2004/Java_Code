import java.util.*;
public class a9arr_median {

    static double f_median(int arr[],int n){

        Arrays.sort(arr);

        if(n%2==0){
            return ( (arr[(n-1)/2]+arr[n/2])/2.0);
        }else{
            return arr[n/2];
        }
    }
    public static void main(String arg[]){
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        
        System.out.println(f_median(arr, n));
    }
}
