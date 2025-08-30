class a1arr_max{

    public static int greater(int arr1[]){
        int big = arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>big){
                big = arr1[i];
            }
        }
        return big;
    }

    public static void main(String args[]){
        int[] arr1={54,12,32,45,105};
        System.out.println(greater(arr1));

    }
}