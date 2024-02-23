package Concepts.Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("For Loop");


        // 0 to n

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        
        sc.close();

        // for(int i = 0; i < n; i++){
        //     System.out.println(i);
        // }

        int i = 0;

        // for(;i < n;i++){
        //     System.out.println(i);
        // }


        // for(;i < n;){
        //     System.out.println(i);
        //     i++;
        // }

        for(;;){
            if(i < n){
                System.out.println(i);
                i++;
            }
            else{
                break;
            }
        }
    }
}
