package Challenges.String;

public class CheckPalindrome {

    public static boolean isPal(String s){
        s = s.toLowerCase();
        StringBuilder newStr = new StringBuilder();

        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || (int)(ch) >= 48 && (int)(ch) <= 57){
                newStr.append(s.charAt(i));
            }
        }
        System.out.println(newStr);

        

        return check(newStr);
    }

    public static boolean check(StringBuilder str){

        int s = 0;
        int e = str.length() - 1;

        while (s < e) {
            if(str.charAt(s++) != str.charAt(e--)){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
       

        System.out.println("is Palindrome : "+ isPal(str));
    }
}
