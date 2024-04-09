package Questions.CodeStudio;

import java.util.Arrays;

public class AggressiveCow {

    public static boolean isPossible(int arr[],int mid,int k){

        Arrays.sort(arr);

        int last = arr[0];
        int cowCount = 1;

        for(int i = 0; i < arr.length; i++){
            if(mid <= arr[i] - last){

            }
        }



        return true;
    }
    public static int aggressiveCow(int arr[],int k){
        int ans = -1;
        
        int s = 0;

        int max = -1;

        for(int el : arr){
            if(max < el){
                max = el;
            }
        }
        int e = max;

        while (s <= e) {
            int mid = s + (e-s)/2;
            if(isPossible(arr,mid,k)){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,6,7,2};
        int k = 5;
        aggressiveCow(arr,k);
    }
}
