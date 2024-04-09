package Concepts.Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

       
        System.out.println("Do While Loop");

        System.out.println("Printing natural numbers up to n");
        int n = 10;

        int i = 0;

        do{
            System.out.print(i+" ");
            i++;
        }
        while(i <= n);


        System.out.println();

        int k = 5;

        do{
            System.out.println(k);
        }
        while(k < 5);


        // getting input in our range

        System.out.println("Enter Number from 1 to 10");
        int number;
        Scanner sc = new Scanner((System.in));

        // do while loop executes the statement at least ones.
        do{
            number = sc.nextInt();
        }
        while (number < 0 || number > 10);
        System.out.println("Well Done");

        sc.close();
    }

}
