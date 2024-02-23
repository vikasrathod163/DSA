package Challenges.Array;

import java.util.Scanner;

public class ReverseArray {

    public static void reverseArr(int arr[]){

        int start = 0;
        int end = arr.length - 1;

        while (!(start >= end)) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
            
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of string : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter Element - "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        for(int el : arr){
            System.out.print(el+" ");
        }

        reverseArr(arr);

        System.out.println("Reversed Array");
        for(int el : arr){
            System.out.print(el+" ");
        }

        sc.close();
    }
}
