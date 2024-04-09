package Concepts.Sorting;

public class QuickSort {

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr,int s,int e){
        int pivot = arr[e];
        int i = s - 1;

        for(int j = s;j <= e;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,j,i);
            }
        }
        swap(arr,i+1,e);
        return i+1;
    }
    public static void quickSort(int[] arr,int s, int e){
        if(s >= e){
            return;
        }

        int p = partition(arr,s,e);
        quickSort(arr, s, p - 1);
        quickSort(arr, p + 1, e);
    }

    public static void main(String[] args) {
        int[] arr = {6,4,2,8,54,23,64,87,11,1,0,2};
        System.out.println("Before Sort!");
        printArr(arr);
        quickSort(arr,0,arr.length - 1);
        System.out.println("\nAfter Sort!");
        printArr(arr);
    }

    public static void printArr(int[] arr){
        for(int el : arr){
            System.out.print(el+ " ");
        }
    }
}