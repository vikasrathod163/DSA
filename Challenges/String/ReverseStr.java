package Challenges.String;

public class ReverseStr {

    public static void reverseStr(char[] str){
        int s = 0;
        int e = str.length-1;

        while (s<e) {
            swap(str, s, e);
            s++;
            e--;
        }
    }

    public static void swap(char arr[],int s,int e){
       char temp = arr[s];
       arr[s] = arr[e];
       arr[e] = temp;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to String Reversal Program!");
        char arr[] = {'n','i','t','i','n','y'};
        reverseStr(arr);
        System.out.println("\nReversed String : ");
        for(char el : arr){
            System.out.println(el);
        }
    }
}
