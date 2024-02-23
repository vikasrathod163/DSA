package Concepts.Operators;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operator......");
        // Arithmetic Operators + , - , / , * , %

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();

        sc.close();

        System.out.println("Addition : "+(a+b));
        System.out.println("Substraction : "+(a-b));
        System.out.println("Division : "+(a/b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Modulus : "+(a%b));
    }
}
