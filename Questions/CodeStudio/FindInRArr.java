package Questions.CodeStudio;

public class FindInRArr {

    public static int binarySearch(int arr[],int key,int s,int e){

        int start = s;
        int end = e;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(key == arr[mid]){
                return mid;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }


        return -1;
    }

    public static int pivotEl(int arr[]){

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



    public static int find(int arr[],int key){

        int pivot = pivotEl(arr);
        int res = -1;

        if(key >= arr[0] && key < arr[pivot]){
            res = binarySearch(arr,key,0,pivot-1);
        }
        else{
            res = binarySearch(arr,key,pivot,arr.length - 1);
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {7,9,10,14,2,3,5,6};
        int key = 5;
        int idx = find(arr,key);
        System.out.println("Found At index -> "+idx);
    }
}
