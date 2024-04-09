package Challenges;

public class MinInMountain {

    public static void min(int[] arr){

        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s)/2;

            if(arr[mid] < arr[0]){
                e = mid;
            }
            if(arr[mid] > arr[0]){
                s = mid + 1;
            }
        }

        System.out.println(arr[e]);
    }

    public static void main(String[] args) {
        int[] arr = {6,8,9,1,2,3,4};
        min(arr);

    }
}