package Concepts.Loops;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("While Loop");

        int n = 11;
        int i = 1;

        while (i < n) {
            System.out.print(i+" ");
            i+=1; // alternatives i++; , i = i + 1;
        }

        // Nested While Loop

        System.out.println("\nNested While Loop");

        int j = 0;
        while (j < 5) {
            System.out.println(j);
            int k = 0;
            while (k < 5) {
                System.out.print(k+" ");

                k++;
            }
            System.out.println();
            j++;
        }
    }
}
