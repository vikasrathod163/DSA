package Challenges.Array;

public class Sort_01 {

    public static void sort(int arr[]){
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
            if(arr[i] > arr[j]){
                swap(arr,i,j);
                i++;
                i--;
            }
        }
    }
    public static void swap(int a[],int i ,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void printArr(int arr[]){
        for(int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1,0,0};
        sort(arr);
        printArr(arr);
    }
}
