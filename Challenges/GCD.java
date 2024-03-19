package Challenges;

public class GCD{
    public static void gcd(int a,int b){
        int ans = 1;

        while (b != 0) {
            ans = a % b;
            a = b;
            b = ans;
        }


        System.out.println("GCD : "+a);
    }
    public static void main(String[] args) {
        int a = 72;
        int b = 36  ;
        gcd(a,b);
    }
} 