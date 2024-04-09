package Questions.LeetCode;

public class Lt88 {
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
                //ans[k++] = ar1[i++];
                i++;
            }
            else {
                //ans[k++] = ar2[j++];
                int temp = ar1[i];
                ar1[i] = ar2[j];
                ar2[j] = temp;
                i++;
            }
        }

        while (i < l1){
            ans[k++] = ar1[i++];
        }
        while (j < l2){
            ans[k++] = ar2[j++];
        }
        return ar1;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Merge!");
        int[] ar1 = {1,4,6,8,9,0,0,0,0,0};
        int[] ar2 = {0,0,0,5,67};

        int[] merged = merge(ar1,ar2);
        printArr(merged);

    }
}
