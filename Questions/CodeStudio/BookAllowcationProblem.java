package Questions.CodeStudio;

public class BookAllowcationProblem {

    public static boolean isPossible(int arr[],int k,int mid){

        int cnt = 1;
        int pageSum = 0;
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i] + pageSum <= mid){
                pageSum += arr[i];
            }
            else{
                cnt++;
                if(cnt > k || arr[i] > mid){
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }

    public static int allowcateBook(int arr[],int k){
        int ans = -1;
        int sum = 0;
        for(int el : arr){
            sum += el;
        }
        int s = 0;
        int e = sum;

        while (s <= e) {
            int mid = s + (e-s)/2;

            if(isPossible(arr,k,mid)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }



        return ans;
    }
    
    public static void main(String[] args) {
        int arr[] = {40,50,50,40}; // 10 110 , 30 90 , 80 40 
        int k = 2;
        System.out.println(allowcateBook(arr,k));
    }
}
