package Questions.CodeStudio;

public class TotalOccur {

    public static int L(int arr[],int key){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

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
        }

        return ans;
    }

    public static int F(int arr[],int key){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
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
    public static int occur(int arr[],int key){
        int ans[] = new int[2];


        ans[0] = F(arr,key);
        ans[1] = L(arr,key);

        int finalAns = ans[1] - ans[0] + 1;
        return finalAns;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,6,6,6,6,6,6,6,6,6,7,8};
        int key = 5;
        int ans = occur(arr,key);

        System.out.println("Total Occurrence of element "+key+" is : "+ans);
    }
}
