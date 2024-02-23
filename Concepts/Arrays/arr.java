package Concepts.Arrays;

import java.util.Scanner;

public class arr {

    public static void printArray(int arr[]){
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.println(arr[i]);
    //     }

        System.out.println("Printing array");
        for (int element : arr) {
            System.out.print(element+" ");
        }
        System.out.println("\nPrinting finished");
    }

    public static void updateArray(int ar[]){

        int temp[] = ar;
        // printArray(temp);
        temp[0] = 50;
        // printArray(temp);
    }

    public static void main(String[] args) {
/*
        int ar1[];
        ar1 = new int[5];

        printArray(ar1);

        // initializing all the elements with 1

        for(int i = 0;i < 5; i++){
            ar1[i] = 1;
        }

        // System.out.println("After initialization");
        // printArray(ar1);

        // System.out.println(ar1);

        // int arr[] = {3,4,5,4};
        // printArray(arr);

        System.out.println("----------------------------------");
        int arr1[] = new int[10];
        
        arr1[5] = 500;


        printArray(arr1);

        updateArray(arr1);

        printArray(arr1);

         */

        Scanner sc = new Scanner(System.in);

        int newArr[] = new int[5];

        for(int i = 0; i < newArr.length; i++){
            newArr[i] = sc.nextInt();
        }

        printArray(newArr);
        sc.close();

    }
}
