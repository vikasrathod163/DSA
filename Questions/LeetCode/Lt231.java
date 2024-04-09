package Questions.LeetCode;

public class Lt231 {
    public static boolean pot(int n){

        int ans = 1;
        for(int i = 0;i < 30; i++){

            if(n == 1){
                return true;
            }
            ans = ans * 2;
            if(ans == n){
                return true;
            }
            if(ans > n){
                return false;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        // Power of 2
        System.out.println(pot(7));
    }
}
