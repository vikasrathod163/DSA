package Questions.LeetCode;

public class Lt443 {

    public static int compress(char [] chars){


        int len = chars.length;
        int i = 0;
        int ansIdx = 0;
        while (i < len) {
            int j = i+1;
            //System.out.println(j);
            while (j < len && chars[i] == chars[j]) {
                j++;
            }
            chars[ansIdx++] = chars[i];
            int cnt = j - i;
            
            if (cnt > 1){
                String s = String.valueOf(cnt);
                int sLen = s.length();
                for(int k = 0;k < sLen;k++){
                    chars[ansIdx++] = s.charAt(k);
                }
            }
            i = j;
        }

        return ansIdx;
    }
    public static void main(String[] args) {
        char arr[] = {'a','a','b','b','c','c','c'};
        System.out.println(compress(arr));
    }
}