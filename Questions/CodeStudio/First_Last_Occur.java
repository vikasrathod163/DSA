package Questions.CodeStudio;

public class First_Last_Occur {

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
    public static int[] occur(int arr[],int key){
        int ans[] = new int[2];


        ans[0] = F(arr,key);
        ans[1] = L(arr,key);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,6,6,6,6,6,6,6,6,6,7,8};
        int key = 6;
        int o[] = occur(arr,key);

        System.out.println("First Occurrence of element "+key+" is at index : "+o[0]);
        System.out.println("Last Occurrence of element "+key+" is at index : "+o[1]);

    }
}
