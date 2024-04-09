package Challenges;

import java.util.ArrayList;

public class CatlanNumbers {
    public static void cat(int n){
        ArrayList<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(1);
        int k = 1;

        if(n == 0){
            System.out.println("C0:1");
            return;
        }
        
        while (k < n) {

            int i =  0;
            int j = c.size() - 1;

            int catlan = 0;
            while (i < c.size() && j >= 0) {
                catlan = catlan + c.get(i++) * c.get(j--);
            }
            c.add(catlan);
            
            k++;
        }

        int cnt = 0;
        for(int el : c){
            System.out.print("C"+cnt+":"+el+"\n");
            cnt++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Catlan Numbers");
        int n = 5;
        cat(n);
    }
}
