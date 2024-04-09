package Challenges.String;

public class Occur_Char {

    public static char occur(String str){
        int cnt[] = new int[26];
        int index;
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            index = ch - 'a';
            cnt[index]++;
        }
        System.out.println();

        int max = -1;
        int idx = -1;
        for(int i = 0;i < cnt.length;i++){
            if(cnt[i] > max){
                max = cnt[i];
                idx = i;
            }
        }
        // System.out.println("occurrence : "+max);
        return (char)(idx + 'a');
    }
    public static void main(String[] args) {
        String str = "vaaaikass";
        char maxOccur = occur(str);
        System.out.println("Maximum time occured Charecter is : "+maxOccur);
    }
}
