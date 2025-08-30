public class a5arr_ele_freque{
    public static void main(String args[]){
        int arr[] = {10,54,62,75,10,54};
        int n = arr.length;
        ele_freque(arr,n);
    }
    public static void ele_freque(int arr[], int n){
        boolean visited[]= new boolean[n];
        

        for(int i= 0;i<n;i++){

            int count =1;

            if(visited[i]==true){
                continue;
            }
            for(int j= i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j] =true;
                    count++;
                }
            }
            System.out.println("The Frequency of "+arr[i]+" is "+count);
        }
    }
}