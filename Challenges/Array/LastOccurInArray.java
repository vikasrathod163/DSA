package Challenges.Array;

public class LastOccurInArray {

    public static int lastOccur(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == key){
                ans = mid;
                start = mid + 1;
            }
            else if(arr[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            System.out.println(mid);
        }
        return ans;
    }
    
    public static void mainI(String args[]){
        int arr[] = {2,3,5,6,7,7,7,8,9};

        System.out.println(lastOccur(arr, 7));
    }
}
