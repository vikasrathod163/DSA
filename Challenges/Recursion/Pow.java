package Challenges.Recursion;

public class Pow { 
    public static int pow(int a,int b){
        if(b == 0){
            return 1;
        }
        if(b == 1){
            return a;
        }

        int ans = pow(a,b/2);
        System.out.println(ans);

        if((b&1) == 1){
            return a * ans * ans;
        }
        else{
            return ans * ans;
        }
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 11;
        int ans = pow(a,b);
        System.out.println(ans);
    }
}
