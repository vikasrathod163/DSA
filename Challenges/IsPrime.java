package Challenges;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Welcome to Prime number checker");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        sc.close();

        int i = 2;

        boolean flag = true;
        while (i < n) {
            if(n%i == 0){
                flag = false;
            }
            i++;
        }

        if(flag){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is Not Prime");
        }

    }
}
