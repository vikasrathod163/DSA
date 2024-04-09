package Challenges.Conversions;

public class BinaryToDecimal {

    public static int dec(int n){
        int ans = 0;

        int i = 0;
        while (n != 0) {
            int bit = n%10;

            if(bit == 1){
                ans = ans + (int)Math.pow(2,i);
            }
            n = n/10;
            i++;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(dec(100000));
    }
}
