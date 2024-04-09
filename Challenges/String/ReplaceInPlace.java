package Challenges.String;

public class ReplaceInPlace {

    public static String replace(String str){
        str = str.replace(" ", "@40");
        StringBuilder s = new StringBuilder(str);
        
        // StringBuilder newStr = new StringBuilder();

        

        // for(int i = 0;i < str.length();i++){
        //     if(str.charAt(i) == ' '){
        //         newStr.append('@');
        //         newStr.append('4');
        //         newStr.append('0');
        //     }
        //     else{
        //         newStr.append(str.charAt(i));
        //     }
        // }

        return str;
    }
    public static void main(String[] args) {
        String s = "my name is vikas";
        System.out.println(s);
        System.out.println(replace(s));
        System.out.println(s);
    }
}