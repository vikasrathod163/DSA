package Challenges.Recursion;

public class FirstOccurInArr {
    public static int first(int[] arr,int s,int e,int key){
        
        if(s > e){
            return s;
        }

        int mid = s + (e-s)/2;
        System.out.println(arr[mid]);

        if(arr[mid] == key){
            return first(arr, s, mid - 1, key);
        }
        else if(arr[mid] < key){
            return first(arr, mid + 1, e, key);
        }
        else{
            return first(arr, s, mid - 1, key);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,5,6,6,6,7,7,78,99};
        System.out.println(arr.length);
        int key = 6;
        System.out.println("First Occurrence : "+first(arr,0,arr.length- 1,key));
    }
}
