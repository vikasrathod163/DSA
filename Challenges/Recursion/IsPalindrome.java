package Challenges.Recursion;

public class IsPalindrome {
    public static boolean isPalindrome(char[] str,int s,int e){

        //System.out.println(String.valueOf(str));
        if(s > e){
            return true;
        }

        if(str[s] != str[e]){
            return false;
        }
        else{
            return isPalindrome(str, ++s, --e);
        }
    }
    public static void main(String[] args) {
        String str = "nitin";
        boolean isPal = isPalindrome(str.toCharArray(),0,str.length()-1);
        System.out.println(isPal);
    }
}
