package Challenges.Recursion;

public class ArraySumUsingRec {

    public static int sumArr(int[] arr,int n){
        
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return arr[0];
        }

        return arr[n] + sumArr(arr,n-1);
    }
    public static void main(String[] args) {
        int[] arr = {5,2,3,6,4,8};
        int n = arr.length;
        int sum = sumArr(arr,n-1);
        System.out.println("Sum is : "+sum);
    }
}
