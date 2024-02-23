package Challenges;

import java.util.Scanner;

public class ComplimentOfBase10 {

    public static int comp(int n){

        int mask = 0;
        int temp = n;

        while (n != 0) {

            mask = mask<<1;
            mask = mask | 1;
            n = n>>1;
        }

        return (~temp&mask);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int num = sc.nextInt();
        sc.close();
        int n = comp(num);
        System.out.println(n);
    }
}