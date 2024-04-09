package Concepts.Sorting;

public class BubbleSort {
    public static void printArr(int[] arr){
        for(int el : arr){
            System.out.print(el+" ");
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n;i++){
            for(int j = 0; j < n-i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Bubble Sort!");
        System.out.println("Before Sort!");
        int[] arr = {32,25,3,6,7,4,2};
        printArr(arr);
        bubbleSort(arr);
        System.out.println("\nAfter Sort!");
        printArr(arr);
    }
}
