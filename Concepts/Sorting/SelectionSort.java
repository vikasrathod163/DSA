package Concepts.Sorting;

public class SelectionSort {
    public static void selSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1;i++){
            int minIdx = i;
            for(int j = i + 1;j < n;j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            swap(arr,minIdx,i);
        }
    }
    public static void swap(int[] arr, int min, int i){
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Selection Sort!");
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        for(int el : arr){
            System.out.print(el+" ");
        }

        selSort(arr);
        System.out.println("\nAfter Selection Sort!");
        for(int el : arr){
            System.out.print(el+" ");
        }
    }
}
