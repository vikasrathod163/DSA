package Concepts.Searching;

public class LinearSearch {

    public static int linerSearch(int arr[],int key){

        for(int i = 0; i < arr.length; i++){
            if(key == arr[i]){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Linear Search");
        int arr[] = {2,3,5,7,4,444,43,23,43,54};
        int key = 23;
        System.out.println("Found at index : "+linerSearch(arr,key));
    }
}
