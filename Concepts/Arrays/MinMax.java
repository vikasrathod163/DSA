package Concepts.Arrays;

import java.util.Scanner;

public class MinMax {

    public static int max(int ar[]){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }

        return max;
    }

    public static int min(int ar[]){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < ar.length; i++){
            if(ar[i] < min){
                min = ar[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        System.out.println("Min and Max element in an array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements");

        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int e : arr){
            System.out.println(e+" ");
        }



        
        System.out.println("Min : "+max(arr));
        System.out.println("Max : "+min(arr));

        sc.close();
    }
}
