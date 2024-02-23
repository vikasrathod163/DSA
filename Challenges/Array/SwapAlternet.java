package Challenges.Array;

import java.util.Scanner;

public class SwapAlternet {

    public static void swapAlternet(int arr[]){
        int first = 0;
        int i = 0;
        int n = arr.length/2;

        while (i < n) {

            //swap
            int temp = arr[first];
            arr[first] = arr[first+1];
            arr[first+1] = temp;

            first+=2;
            i++;
        }
    }
    public static void main(String[] args) {
        System.out.println("--Swap Alternatives--");

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

        swapAlternet(arr);


        System.out.println("Swaped");
        for(int el : arr){
            System.out.print(el+" ");
        }

        sc.close();
    }
}
