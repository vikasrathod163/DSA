package Challenges;

public class DigitToNumber {

    public static int numInReverse(int a[]){
        int l = a.length;
        int i = 0;
        int ans = 0;
        while (i < l) {
            ans = (int)(a[i] * Math.pow(10, i) + ans);
            i++;
        }
        return ans;
    }

    public static int numInSequence(int a[]){
        int l = a.length;
        int i = 0;
        int ans = 0;

        while (i < l) {
            ans = ans + a[i];
            i++;

            if(i < l){
                ans = ans * 10;
            }
        }

        return ans;
    }

    public static int numInSequence_2(int a[]){
        int l = a.length;
        int i = 0;
        int ans = 0;

        while (i < l) {
            int digit = a[i];
            ans = ans*10 + digit;
            i++;
        }

        return ans;
    }
    public static void main(String[] args) {

        int ar[] = {1,2};
        int num = numInSequence_2(ar);
        System.out.println(num);
    }
}
