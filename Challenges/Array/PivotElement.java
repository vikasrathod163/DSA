package Challenges.Array;

public class PivotElement{
    public static int pivot(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[0]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {

        // Finding pivot element from the rotated array
        int arr[] = {5,6,8,9,12,25,0,1,2,3};

        int el = pivot(arr);
        System.out.println("The pivot element for the rotated array is -> "+arr[el]+" that is at index -> "+el);
    }
}