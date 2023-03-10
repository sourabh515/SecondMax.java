package Array;

public class secondmax {
    static void SecMax(int arr[], int n){
        int max = arr[0];
        int secondmax = arr[0];
        for(int i = 0; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
                secondmax = arr[i-1];
            }
        }
        System.out.println("Max Element: "+ max);
        System.out.println("Second_Max Element: "+ secondmax);
       }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        SecMax(arr, n);
    }
}