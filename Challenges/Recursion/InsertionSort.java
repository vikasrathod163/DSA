package Challenges.Recursion;

public class InsertionSort {
    public static void sort(int[] arr,int i,int n){
        for(int el : arr){
            System.out.print(el+ " ");
        }
        System.out.println(" i : "+i);
        if(i == n){
            return;
        }

        // Base case
        if(n == 0 || n == 1){
            return;
        }

        int j = i - 1;
        int temp = arr[i];
        while (j >= 0) {
            if(arr[j] > temp){
                arr[j+1] = arr[j];
            }
            else{
                break;
            }
            j--;
        }
        arr[j+1] = temp;

        sort(arr, i+1, n);

        // Recursive call


    }
    public static void main(String[] args) {
        int[] arr = {56,87,9,0,98,5,6,4,8,4};
        sort(arr,1,arr.length);
        for(int el : arr){
            System.out.print(el+ " ");
        }
    }
}
