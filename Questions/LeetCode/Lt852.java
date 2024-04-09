package Questions.LeetCode;

public class Lt852 {

    public static void printArr(int arr[]){
        for(int el : arr){
            System.out.print(el+" ");
        }
    }

    public static int peakM(int arr[]){
        int peak = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
        }
        peak = start;
        return peak;
    }
    public static void main(String[] args) {
        // Peak mountain

        int arr[] = {1,3,5,6,7,77,234,65,43,21,1};
        printArr(arr);

        // finding peak index in mountain array

        System.out.println();
        int ans = peakM(arr);
        System.out.println("Peak index "+ans+" and element is : "+arr[ans]);

    }
}
