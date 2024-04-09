package Challenges.Array;

public class Sort_012 {

    public static void printArr(int arr[]){
        for(int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }

    public static void sort(int arr[]){
        int i = 0;
        int j = arr.length - 1;
        int k = 0;

        while (k < j) {
            if(arr[k] == 0){
                swap(arr,k,i);
                i++;
                k++;
            }
            if(arr[k] == 1){
                k++;
            }

            if(arr[k] == 2 && k < j){
                swap(arr,k,j);
                j--;
            }
        }
    }

    public static void swap(int a[],int i ,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,1,1,2,0,0,2,2,1,0,1};
        sort(arr);
        printArr(arr);
        
    }
}
