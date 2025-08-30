import java.util.*;

public class a7arr_incre_decre {
    public static void main(String arg[]){
        int arr[] = {54,2,32,54,94,11};
        Arrays.sort(arr);
        int n = arr.length;
        for(int i =0;i<n/2;i++){
            System.out.print(arr[i]+"  ");
        }

        for(int i =n-1;i>=n/2;i--){
            System.out.print(arr[i]+"  ");
        }
    }
}

