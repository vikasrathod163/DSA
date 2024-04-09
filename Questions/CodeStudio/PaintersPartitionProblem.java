package Questions.CodeStudio;

public class PaintersPartitionProblem {
    public static boolean isPossible(int arr[],int k,int mid){
        int pCount = 1;
        int timeSum = 0;

        for(int i = 0; i < arr.length; i++){
            if(timeSum + arr[i] <= mid){
                timeSum += arr[i];
            }
            else{
                pCount++;

                if(pCount > k || arr[i] > mid){
                    return false;
                }
                timeSum = arr[i];
            }
        }
        return true;
    }

    public static int minTime(int arr[],int k){
        int s = 0;
        int sum = 0;
        for(int el : arr){
            sum += el;
        }
        int e = sum;

        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s)/2;
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
        int arr[] = {5,5,10,5};
        int k = 2;
        
        int m = minTime(arr,k);
        System.out.println(m);
    }
}
