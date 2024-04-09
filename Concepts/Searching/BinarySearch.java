package Concepts.Searching;

public class BinarySearch {

    public static void printArr(int arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static int binarySearch(int arr[],int key){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(key == arr[mid]){
                return mid;
            }

            if(key > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int evenArr[] = {3,7,9,77,89,799};
        int oddArr[] = {3,6,7,8,9,99,100};

        int key = 101;
        System.out.println("Found At index : "+binarySearch(evenArr,key));
        System.out.println("Found At index : "+binarySearch(oddArr, key));
    }
}
