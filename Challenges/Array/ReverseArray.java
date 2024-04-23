package Challenges.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
            int s = 0;
            int e = a.size() - 1;
            
            while(!(s >= e)){
                swap(a,s++,e--);
                for(int i = 0;i < a.size();i++){
                    System.out.print(a.get(i)+" ");
                }
                System.out.println();
            }
            
            return a;
    
        }
        public static void swap(List<Integer> list,int a,int b){
            int temp = list.get(a);
            int el = list.get(b);

            System.out.println(temp+" "+el);
            
            list.set(a,el);
            list.set(b,temp);
            
            
            
        }

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


        List<Integer> l = new ArrayList();

        l.add(5);
        l.add(7);
        l.add(9);

        List<Integer> ans = reverseArray(l);

        for(int i = 0;i < ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
