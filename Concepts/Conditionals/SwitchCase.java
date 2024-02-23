package Concepts.Conditionals;

public class SwitchCase {
    public static void main(String[] args) {
        int i = 0;

        switch (i) {
            case 0:
                System.out.println("its 0");
                break;
            case 1:
                System.out.println("its one");
                break;
            default:
                System.out.println("it is Default");
                break;
        }


        char ch = 'z';

        switch (ch) {  // switch (2*2)  - means expression can be added here
            case 'a':
                System.out.println("its a");
                break;
            
            case 'b':
                System.out.println("its b");
                break;

            default:
                System.out.println("its default");
                break;
        }
    }
}
