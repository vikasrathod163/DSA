package Questions.LeetCode;

public class Lt1281 {

    public static int sum(int n){
        int sum = 0;
        int product = 1;

        while (n != 0) {
            int digit = n%10;
            sum+=digit;
            product*=digit;

            n/=10;
        }
        return product-sum;
    }
    public static void main(String[] args) {
        int answer = sum(4421);
        System.out.println(answer);
    }
}
