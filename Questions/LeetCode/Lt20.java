package Questions.LeetCode;

import java.util.Stack;

public class Lt20 {
    public static boolean isValid(String s){
        Stack<Character> stk = new Stack<>();

        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                stk.push(s.charAt(i));
            }
            else{
                if(s.charAt(i) == ')' && stk.peek() == '('){
                    stk.pop();
                }
                else if(s.charAt(i) == '}' && stk.peek() == '{'){
                    stk.pop();
                }
                else if(s.charAt(i) == ']' && stk.peek() == '['){
                    stk.pop();
                }
                else{
                    return false;
                }
            }
        }

        if(stk.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean isv = isValid("[");
        System.out.println(isv);
    }
}
