package Challenges;

public class NCr {

    public static long fact(int n){
        long fact = 1;

        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static long nCr(int n, int r){
        long upper = fact(n);
        long lower = (fact(r)*(fact(n-r)));
        long ans = upper/lower;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(nCr(20,2));
    }
}
