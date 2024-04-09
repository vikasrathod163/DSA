package Questions.LeetCode;

public class Lt567 {
    public static boolean checkEqual(int cnt1[],int cnt2[]){
        int i = 0;

        while (i < 26) {
            if(cnt1[i] != cnt2[i]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean per(String s1,String s2){

        int cnt1[] = new int[26];
        for(int i = 0;i < s1.length();i++){
            char ch = s1.charAt(i);
            int index = ch - 'a';
            cnt1[index]++;
        }

        int i = 0;
        int windowSize = s1.length();
        int cnt2[] = new int[26];
        while (i < windowSize && i < s2.length()) {
            char ch = s2.charAt(i);
            int index = ch - 'a';
            cnt2[index]++;
            i++;
        }

        if(checkEqual(cnt1,cnt2)){
            return true;
        }

        while (i < s2.length()) {
            char newChar = s2.charAt(i);
            int index = newChar - 'a';
            cnt2[index]++;

            char oldChar = s2.charAt(i-windowSize);
            int index2 = oldChar - 'a';
            cnt2[index2]--;

            i++;
            if(checkEqual(cnt1, cnt2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(per("yb", "aaaabxxxy"));
    }
}
