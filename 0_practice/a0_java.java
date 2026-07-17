import java.util.*;





public class a0_java {

  public static int[] insert_at_beg(int arr[],int num){
  int arr2[] = new int[arr.length+1];
  arr2[0]=num;
  for(int i=1;i<arr2.length+1;i++){
arr2[i] = arr[i-1];
  }
  return arr2;
}
    public static void main(String[] args) {

        int[] arr = {122,45,78,65};
         int[] result = insert_at_beg(arr, 10);

        for (int num : result) {
            System.out.print(num + " ");
        }

       
}}
