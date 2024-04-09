package Concepts.Sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr){

        int n = arr.length;
        for(int i = 1;i < n;i++){
            int temp = arr[i];
            int j;
            for(j = i-1;j>=0;j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }
    public static void printArr(int[] arr){
        for(int el : arr){
            System.out.print(el+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to selection Sort!");
        int[] arr = {5,6,9,4,48,65,4,-4};
        System.out.println("Before Sort!");
        printArr(arr);
        insertionSort(arr);
        System.out.println("\nAfter Sort!");
        printArr(arr);
    }
}
