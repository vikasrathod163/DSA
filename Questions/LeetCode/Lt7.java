package Questions.LeetCode;

public class Lt7 {

    public static int reverseInteger(int n){

        int reversed = 0;

        while (n != 0) {
            int digit = n%10;

            if(reversed < (Integer.MIN_VALUE/10) || reversed > (Integer.MAX_VALUE/10)){
                return 0;
            }
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        return reversed;
    }
    public static void main(String[] args) {
        int n = 123419999;
        int ans = reverseInteger(n);
        System.out.println(ans);

        System.out.println(Integer.MAX_VALUE);

        System.out.println("Range of Integer : "+ (-(Math.pow(2, 31)))+" to "+(Math.pow(2, 31)-1));
    }    
}
