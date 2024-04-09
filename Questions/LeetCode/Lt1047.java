package Questions.LeetCode;

public class Lt1047 {

    public static String removeAdjDuplicates(String s){
        StringBuilder newStr = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (newStr.length() > 0 && newStr.charAt(newStr.length() - 1) == ch) {
                newStr.deleteCharAt(newStr.length() - 1);
            } else {
                newStr.append(ch);
            }
        }
        String ans = String.valueOf(newStr);
        return ans;
    }
    public static void main(String[] args) {
        String str = "zxxyyzqpp";
        System.out.println(removeAdjDuplicates(str));
    }
}
