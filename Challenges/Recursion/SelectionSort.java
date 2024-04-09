package Challenges.Recursion;

public class SelectionSort {
    public static void sort(int[] arr,int i,int n){
        // base case
        if(n == 0 || n == 1){
            return;
        }

        int j = i + 1;
        int min = i;
        while (j < arr.length) {
            if(arr[j] < arr[min]){
                min = j;
            }
            j++;
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;

        // Recursive call
        sort(arr, i + 1, n - 1);
        
    }
    public static void main(String[] args) {
        int[] arr = {8,6,4,9,3,2};
        sort(arr,0,arr.length);
        for(int el : arr){
            System.out.print(el + " ");
        }

        // 2 6 4 9 3 8
        // 2 3 4 9 6 8

    }
}
