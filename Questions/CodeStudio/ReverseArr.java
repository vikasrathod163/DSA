package Questions.CodeStudio;

public class ReverseArr {
    public static void printArr(int[] arr){
        for(int el : arr){
            System.out.print(el+" ");
        }
    }

    public static void reverse(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while (s<=e){
            swap(arr,s++,e--);
        }
    }
    public static void swap(int[] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,87,54,35,32};
        int[] ar2 = {5,4,2,88,65};
        System.out.print("Even Length Array : ");
        printArr(arr);
        System.out.print("\nOdd Length Array : ");
        printArr(ar2);

        reverse(arr);
        reverse(ar2);
        System.out.println();
        System.out.print("After Reversing Even Length Array : ");
        printArr(arr);
        System.out.print("\nAfter Reversing Odd Length Array : ");
        printArr(ar2);

    }
}
