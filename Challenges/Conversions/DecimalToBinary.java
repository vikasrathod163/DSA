package Challenges.Conversions;
import java.lang.Math;
public class DecimalToBinary {

    public static int bin(int n){
        int ans = 0;

        int i = 0;

        while (n != 0) {
            int bit = n & 1;
            ans = (int)(bit * Math.pow(10,i)) + ans;
            System.out.println(ans);
            n = n>>1;
            i++;
        }


        return ans;

    }
    public static void main(String[] args) {
        int n = 10;
        int bin = bin(n);
        System.out.println(bin);
    }
}
