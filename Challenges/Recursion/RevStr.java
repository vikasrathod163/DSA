package Challenges.Recursion;

public class RevStr {
    public static String rev(char[] str,int s,int e){
        if(s > e){
            return "";
        }
        char temp = str[s];
        str[s] = str[e];
        str[e] = temp;
       // System.out.println(str);
        rev(str, ++s, --e);
        

        return String.valueOf(str);
    }
    public static void main(String[] args) {
        String str = "vikas rathod";
        str = rev(str.toCharArray(),0,str.length()-1);
        System.out.println(str);
        //System.out.println(rev(str.toCharArray(),0,str.length()-1));
        
    }
}
