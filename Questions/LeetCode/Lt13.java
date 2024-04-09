package Questions.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Lt13 {

    public static int romanToInt(String s){

        Map<Character,Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int val = 0;
        
        for(int i = 0;i < s.length();i++){
            int j = i + 1;
            if(j < s.length() && m.get(s.charAt(i)) < m.get(s.charAt(j) ) ){
                int temp =  m.get(s.charAt(j)) - m.get(s.charAt(i));
                val = val + temp;
                i++;
            }
            else{
                val += m.get(s.charAt(i));
            }
        }

        return val;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("XIX"));
    }
    
}