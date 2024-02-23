package Concepts.Conditionals;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {


        // if

        int i = 3;

        if(i == 3){
            System.out.println("i is equal to 3");
        }

        // if else

        int n = 32;

        if(n > 50){
            System.out.println("Greater than 50");
        }
        else{
            System.out.println("Less than 50");
        }


        // if else if ladder

        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Number is -ve");
        }
        else if(num > 0){
            System.out.println("Number is +ve");
        }
        else{
            System.out.println("Number is Zero");
        }



        int val = 1;

        // boolean ans = val == 1? true : false;
        // int ans = val == 1 ? 1 : 0;
        String ans = val == 1? "Yes": "No";
        System.out.println("val == 1 : "+ans);


        int val2 = -123;

        if (val2 > 0) System.out.println("+ve");
        if (val2 > 0) System.out.println("+ve"); else System.out.println("No");


        if (val == 2)
            System.out.println("Yes it is true");
        else
            System.out.println("its False");
        sc.close();
    }
}
