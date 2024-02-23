package Challenges;

public class PowerOfTwo {

    public static boolean pot(int n){

        int i = 1;
        int j = 0;
        while (j < 30) {
            i = i * 2;
            System.out.println(i);
            if(i == n){
                return true;
            }

            if(n < i){
                return false;
            }
            j++;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(pot(0));
    }
}
