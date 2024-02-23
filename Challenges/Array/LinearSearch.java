package Challenges.Array;

import java.util.Scanner;

public class LinearSearch {

    public static int ls(int arr[],int key){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
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

        System.out.print("\nEnter the element wants to be searched : ");
        int key = sc.nextInt();

        int isFound = ls(arr,key);
        if(isFound == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found at index : "+isFound);
        }





        sc.close();
    }
}
