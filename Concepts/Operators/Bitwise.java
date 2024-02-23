package Concepts.Operators;

import java.util.Scanner;

public class Bitwise{
    public static void main(String[] args) {
        System.out.println("Welcome to Bitwise Operators");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();

        sc.close();

        int c = a&b;
        System.out.println("And - "+c);

        int d = a|b;
        System.out.println("Or - "+d);

        int e = a^b;
        System.out.println("XOR - "+e);

        int f = ~a;
        System.out.println("Not - "+f);

        // Right and Left Shift Operators

        int val = 8;
        System.out.println(val+" After right shift by 1 : "+(val>>1)); // ans 2
        System.out.println(val+" After right shift by 2 : "+(val>>2)); // ans 1

        System.out.println(val+" After left shift by 1 : "+(val<<1)); // ans 14
        System.out.println(val+" After left shift by 2 : "+(val<<2)); // ans 28


        for(int i = 1;i <= 30;i++){
            System.out.println(1<<i);
        }
    }
}