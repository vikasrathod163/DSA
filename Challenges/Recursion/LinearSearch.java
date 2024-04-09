package Challenges.Recursion;

public class LinearSearch {
    public static int search(int[] arr,int n,int key){
        if(n < 0){
            return -1;
        }
     
        if(arr[n] == key){
            return n;
        }
        else{
            return search(arr, n-1, key);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,8,9};
        int key = 99;
        int n = arr.length;
        int ansIdx = search(arr,n-1,key);
        System.out.println("Answer index : "+ansIdx);
    }
}
