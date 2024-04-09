package Challenges.Array;

public class MergeArr {
    public static void printArr(int[] arr){
        for(int el : arr){
            System.out.print(el+" ");
        }
    }
    public static int[] merge(int[] ar1,int[] ar2){
        int i = 0;
        int j = 0;
        int l1 = ar1.length,l2 = ar2.length;

        int[] ans = new int[l1+l2];
        int k = 0;

        while (i < ar1.length && j < ar2.length){
            if(ar1[i] < ar2[j]){
                ans[k++] = ar1[i++];
            }
            else {
                ans[k++] = ar2[j++];
            }
        }

        while (i < l1){
            ans[k++] = ar1[i++];
        }
        while (j < l2){
            ans[k++] = ar2[j++];
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Merge!");
        int[] ar1 = {1,4,6,8,9};
        int[] ar2 = {0,2,3,5,23,46,67};

        int[] merged = merge(ar1,ar2);
        printArr(merged);

    }
}
