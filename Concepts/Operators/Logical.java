package Concepts.Operators;

public class Logical {
    public static void main(String[] args) {
        System.out.println("Logical Operator"); // && ||      
        
        if(1 < 2 && 1 < 5){
            System.out.println("True");
        }


        int a = 1,b = 0;
        if(a == 0 || b == 1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        System.out.println();
        System.out.println(a == 0 && b == 0);

        System.out.println(a == 1 || b ==5);
    }
}
