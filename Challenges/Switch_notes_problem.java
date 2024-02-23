package Challenges;

import java.util.Scanner;

public class Switch_notes_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount : ");
        int amount = sc.nextInt();
        sc.close();

        int h = 0;
        int f = 0;
        int t = 0;
        int o = 0;
        int notes = 0;
        switch (notes) {
            case 0:
                h = amount/100;
                amount = amount%100;
                //break;
            case 1:
                f = amount/50;
                amount = amount%50;
                //break;
            case 2:
                t = amount/20;
                amount = amount%20;
                //break;
            case 3:
                o = amount/1;
                amount = amount%1;
                break;
            default:
                System.out.println("Enter Valid Choice!");
        }

        System.out.printf("100 : %d\n50 : %d\n20 : %d\n1 : %d",h,f,t,o);
    }
}
