package Challenges.String;

public class RemoveAdjDuplicates {

    public static String remove(String str){
        StringBuilder newStr = new StringBuilder(str);
        int i = 0; 
        while (!newStr.isEmpty() && i < (newStr.length() - 1)) {
            int j = i+1;
            if(newStr.charAt(i) == newStr.charAt(j)){
                newStr.delete(i, j+1);
                if(i == newStr.length()){
                    break;
                }
                i = 0;
            }
            else{
                i++;
            }
        }
        String ans = String.valueOf(newStr);
        return ans;

        //OPTIMIZED
        
        // StringBuilder newStr = new StringBuilder();
        // for (char ch : s.toCharArray()) {
        //     if (newStr.length() > 0 && newStr.charAt(newStr.length() - 1) == ch) {
        //         newStr.deleteCharAt(newStr.length() - 1);
        //     } else {
        //         newStr.append(ch);
        //     }
        // }
        // String ans = String.valueOf(newStr);
        // return ans;
    }
    public static void main(String[] args) {
        String str = "azxxzy";
        System.out.println(remove(str));
    }
}