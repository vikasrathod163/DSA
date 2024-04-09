package Questions.LeetCode;

import java.util.Arrays;

public class Lt1356 {
    public static int[] sortByBits(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = count(arr[i]) * 10001 + arr[i];
        }

        Arrays.sort(temp);

        for(int i = 0; i < arr.length;i++){
            temp[i] = temp[i] % 10001;
        }

        for(int i = 0;i < arr.length;i++){
            arr[i] = temp[i];
        }
        return temp;
    }

    public static int count(int n){
        int bits = 0;
        while(n != 0){
            if((n & 1) == 1){
                bits++;
            }
            n = n>>1;
        }
        return bits;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        sortByBits(arr);
        for(int el : arr){
            System.out.println(el);
        }
    }
}
