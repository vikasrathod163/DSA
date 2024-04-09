package Concepts.Sorting;

public class MergeSort {

    // public static void merge(int[] arr,int s,int e){
    //     int m = s + (e - s)/2;

    //     int l1 = m - s + 1;
    //     int l2 = e - m;

    //     int[] a1 = new int[l1];
    //     int[] a2 = new int[l2];

    //     int idx1 = s;
    //     int idx2 = m + 1;

    //     for(int i = 0; i < l1;i++){
    //         a1[i] = arr[idx1++];
    //     }
    //     for(int j = 0; j < l2;j++){
    //         a2[j] = arr[idx2++];
    //     }

    //     int i = 0;
    //     int j = 0;

    //     int k = s;
    //     while (i < l1 && j < l2) {
    //         if(a1[i] < a2[j]){
    //             arr[k++] = a1[i++];
    //         }
    //         else{
    //             arr[k++] = a2[j++];
    //         }
    //     }

    //     while (i < l1) {
    //         arr[k++] = a1[i++];
    //     }

    //     while (j < l2) {
    //         arr[k++] = a2[j++];
    //     }

    // }

    public static void merge(int[] arr,int s,int e){
        int mid = s + (e - s)/2;

        int l1 = mid - s + 1;
        int l2 = e - mid;

        int[] a1 = new int[l1];
        int[] a2 = new int[l2];

        int idx1 = s;
        int idx2 = mid + 1;

        for(int i = 0;i < l1;i++){
            a1[i] = arr[idx1++];
        }

        for(int i = 0;i < l2;i++){
            a2[i] = arr[idx2++];
        }

        int i = 0;
        int j = 0;

        int main = s;

        while (i < l1 && j < l2) {
            if(a1[i] < a2[j]){
                arr[main++] = a1[i++];
            }
            else{
                arr[main++] = a2[j++];
            }
        }

        while (i < l1) {
            arr[main++] = a1[i++];
        }

        while(j < l2){
            arr[main++] = a2[j++];
        }
    }

    public static void mergeSort(int[] arr,int s,int e){
        if(s >= e){
            return;
        }
        int mid = s + (e-s)/2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);

        merge(arr,s,e);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Merge Sort!");
        System.out.println();
        int[] arr = {2,7,5,88,76,56,34,54,-2,1,0,99};
        System.out.println("Before Sort");
        printArr(arr);
        mergeSort(arr,0,arr.length - 1);
        System.out.println("\nAfter Sort");
        printArr(arr);
    }

    public static void printArr(int[] arr){
        for(int el : arr){
            System.out.print(el+" ");
        }
    }
}
