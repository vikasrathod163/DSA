package Challenges.Array;

public class FirstOcuurInArray {

    public static int firstOccur(int arr[],int key){

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == key){
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,3,3,3,5,6,7,8};
        System.out.println(firstOccur(arr, 2));
    }
}
