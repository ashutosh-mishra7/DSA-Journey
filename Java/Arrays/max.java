public class max {
    public static void main(String[] args) {
        int arr[] = {3,28,-5,21,10};
        int n = arr.length;
        int maxValue = arr[0];

        for (int i=0; i<=n-1; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }

        System.out.println(maxValue);
    }
}
