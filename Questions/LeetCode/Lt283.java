package Questions.LeetCode;

public class Lt283 {
    public static void printArr(int[] arr){
        for(int el : arr){
            System.out.print(el+" ");
        }
    }
    public static void moveZeros(int[] arr){
        int j = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != 0){
                swap(arr,i,j);
                j++;
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        
        int[] arr = {1,6,0,0,2,0,3,0,22};
        moveZeros(arr);
        printArr(arr);
    }
}
