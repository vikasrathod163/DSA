package Questions.LeetCode;

public class Lt1009 {

    public static int compliment(int n){
        int temp = n;
        int mask = 0;

        while (n != 0) {
            mask = (mask<<1)|1; 
            n = n>>1;
        }

        return ~temp&mask;
    }
    public static void main(String[] args) {
        System.out.println(compliment(0));
    }
}
