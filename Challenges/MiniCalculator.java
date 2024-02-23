package Challenges;

import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd Number : ");
        double b = sc.nextDouble();
        
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("ADDITION - 1\nSUBSTRACTION - 2\nMULTIPLICATION - 3\nDIVISION - 4\nMODUL - 5");
        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.print("\nChoise : ");
        
        int choise = sc.nextInt();

        switch (choise) {
            case 1: System.out.println("Answer : "+(a+b)); break;
            case 2: System.out.println("Answer : "+(a-b)); break;
            case 3: System.out.println("Answer : "+(a*b)); break;
            case 4: System.out.println("Answer : "+(a/b)); break;
            case 5: System.out.println("Answer : "+(a%b)); break;
            default : System.out.println("Enter Valid Choise!!!"); break;
        }

        sc.close();
    }
}
