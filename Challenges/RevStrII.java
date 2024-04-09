package Challenges;

public class RevStrII {
    public static String rev(String str,int k){
        StringBuilder rev = new StringBuilder();

        for(int i = k-1;i >= 0;i--){
            rev.append(str.charAt(i));
        }
        while (k < str.length()) {
            rev.append(str.charAt(k++));
        }
        return String.valueOf(rev);
    }
    public static void main(String[] args) {
        String str = "abcdefg";
        int k = 2;
        System.out.println(rev(str, k));
    }
}
