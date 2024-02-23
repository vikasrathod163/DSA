package Concepts.Arrays;

import java.util.Scanner;

public class SumOfArray {

    public static int sum(int arr[]){
        int sum = 0;
        for(int e : arr){
            sum += e;
        }
        return sum;
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

        System.out.print("Given Array : ");
        for(int e : arr){
            System.out.print(e+" ");
        }

        System.out.println("\nSum of Given Array : "+sum(arr));

        sc.close();
    }
}
