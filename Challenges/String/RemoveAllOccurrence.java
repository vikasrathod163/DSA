package Challenges.String;

public class RemoveAllOccurrence {

    public static String remove(String str,String key){
        StringBuilder s = new StringBuilder(str);
        while (s.length() != 0 && s.indexOf(key) >= 0) {
            System.out.println(s);
            s.delete(s.indexOf(key), s.indexOf(key)+key.length());
            System.out.println(s);
            System.out.println(s.indexOf(key));
        }
        return String.valueOf(s);
    }
    public static void main(String[] args) {
        String str = "eemckxmckx";
        
        String key = "emckx";

        System.out.printf("String : %s\nKey : %s \n",str,key);
        System.out.println("After removing every occurrence of the key { "+key+" } \nString : "+remove(str,key));
    }
}