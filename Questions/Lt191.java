package Questions;

import java.util.Scanner;

public class Lt191 {

    public static int bits(int n){

        int cnt = 0;

        while (n != 0) {


            if((n & 1) == 1){
                cnt++;
            }

            n = n>>1;
        }

        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Integer value : ");
        int n = sc.nextInt();
        sc.close();
        int ans = bits(n);
        System.out.println("Number of 1 Bits : "+ ans);
    }
}
