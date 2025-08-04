public class a8arr_avg {
    public static void main(String arg[]){
        int arr[] = {6,5,4,3,1,2};
        int n = arr.length;

        double sum =0;
        for(int i=0;i<n;i++){
            sum = sum + (double)arr[i];
        }
        double avg = sum/n;
        System.out.println("Average of arr element is "+avg );
    }
}
