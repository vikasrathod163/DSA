package Challenges.Recursion;

public class BubbleSort {
    public static void sort(int[] arr,int n){
        if(n == 0 || n == 1){
            return;
        }
        for(int i = 0;i < n-1;i++){
            int j = i + 1;
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        sort(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,6,5,3,9,0};
        sort(arr,arr.length);
        for(int el : arr){
            System.out.print(el+" ");
        }
    }
}
