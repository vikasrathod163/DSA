package Concepts.Conditionals;

public class Nested {
    public static void main(String[] args) {
        // Nested if

        int n = 10;

        if(n < 15){
            System.out.println("Yes");
            if(n == 10){
                System.out.println("it is 10");
            }
        }

        // Nested if else
        System.out.println("Nested if else");

        int num = 33;
        if(num < 15){
            System.out.println("yes");

            if(num == 11){
                System.out.println("It is 11");
            }
            else{
                System.out.println("its not 11");
            }
        }
        else{
            System.out.println("No");

            if(num < 50){
                System.out.println("Less than 50");
            }
        }
    }
}
