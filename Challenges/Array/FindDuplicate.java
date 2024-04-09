package Challenges.Array;

public class FindDuplicate {
    public static int findD(int[] arr){
        int ans = 0;
        for (int j : arr) {
            ans = ans ^ j;
        }

        for(int i = 1; i < arr.length; i++){
            ans = ans ^ i;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] a = {1,2,4,5,3,4};

        // n = length of array
        // where elements of array are from 1 to n-1
        
        System.out.println(findD(a));
    }
}
