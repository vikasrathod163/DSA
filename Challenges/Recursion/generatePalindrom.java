package Challenges.Recursion;

public class generatePalindrom {
    public static int pal(int n){
        if(n == 0){
            return 0;
        }

        System.out.print(n+" ");
        pal(n-1);
        System.out.print(n+" ");
        return 0;   
    }
    public static void main(String[] args) {
        pal(5);
    }
}
