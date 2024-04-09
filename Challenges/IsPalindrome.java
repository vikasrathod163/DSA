package Challenges;

public class IsPalindrome {
    public static boolean isPalindrome(int x){
        int rev = 0;
        int temp = x;
        while (x != 0) {
            int digit = x%10;
            rev = rev * 10 + digit;
            x = x/10;
        }
        
        return rev == temp;
    }
    public static void main(String[] args) {
        System.out.println("Palindrome Checker");
        int x = 1221;
        System.out.println(isPalindrome(x));
    }
}
