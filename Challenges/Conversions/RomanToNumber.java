package Challenges.Conversions;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {

    public static int r2n(String s){

        int val = 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        

        for(int i = 0;i < s.length();i++){
            int j = i + 1;
            if(j < s.length() && ( map.get(s.charAt(i)) < map.get(s.charAt(j)))){
                int n = map.get(s.charAt(j)) - map.get(s.charAt(i));
                val = val + n;
                i++;
            }
            else{
                val = val + map.get(s.charAt(i));
            }
           
        }
        return val;
    }
    public static void main(String[] args) {
        System.out.println(r2n("IV"));
    }
}
