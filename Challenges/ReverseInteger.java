package Challenges;

import java.util.Scanner;

public class ReverseInteger {

    public static int revOfNumber(int n){

        int reversed = 0;

        while (n != 0) {
            int digit = n%10;

            if(reversed < Integer.MIN_VALUE/10 && reversed > Integer.MAX_VALUE/10){
                return 0;
            }

            reversed = reversed * 10 + digit;
            n = n/10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
        sc.close();

        int rev = revOfNumber(n);
        System.out.println("Reversed of Number is : "+rev);
    }
}
