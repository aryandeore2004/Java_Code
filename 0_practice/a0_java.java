import java.util.*;

public class a0_java {

     public static boolean isSubset(int arr1[], int arr2[]) {

      int n = arr1.length;
      int m = arr2.length;

      if(n<m){
        return false;
      }
      
      for(int i=0;i<m;i++){
        boolean ispresent =false;
        for(int j=0;j<n;j++){
          if(arr2[i]==arr1[j]){
            ispresent =true;
            break;
          }
          
        }
        if(!ispresent){
          return false;
        }


      }


      return true;

}
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
        int arr2[] = {2, 4};
        int arr1[] = {1, 2, 3, 4, 5};
        if (isSubset(arr1, arr2))
            System.out.println("Subset");
        else
            System.out.println("Not a Subset");
    }
        
}
