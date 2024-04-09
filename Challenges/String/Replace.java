package Challenges.String;

public class Replace {
    public static String replace(String str){
        // String newStr = str.replace(" ", "@40");
        StringBuilder newStr = new StringBuilder();

        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == ' '){
                newStr.append('@');
                newStr.append('4');
                newStr.append('0');
            }
            else{
                newStr.append(str.charAt(i));
            }
        }

        return String.valueOf(newStr);
    }
    public static void main(String[] args) {
        String s = "my name is vikas";
        System.out.println(replace(s));
    }
    
}