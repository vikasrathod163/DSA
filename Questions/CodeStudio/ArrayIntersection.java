package Questions.CodeStudio;

import java.util.ArrayList;

public class ArrayIntersection {

    // Brutforce approach Time complexity O(n^2)
    public static ArrayList <Integer> inter(int ar1[],int ar2[]){
        ArrayList < Integer > ans = new ArrayList<>();

        for(int i = 0; i < ar1.length; i++){
            for(int j = 0; j < ar2.length; j++){
                if(ar1[i] == ar2[j]){
                    ans.add(ar1[i]);
                    ar2[j] = -1;
                }
            }
        }
        return ans;
    }

    // Optimized Approach with time complexity O(n)

    public static ArrayList <Integer> interSection(int ar1[],int ar2[]){
        ArrayList <Integer> ansList = new ArrayList<>();

        int i = 0;
        int j = 0;
        
        while (i < ar1.length && j < ar2.length) {
            if(ar1[i] == ar2[j]){
                ansList.add(ar1[i]);
                i++;
                j++;
            }
            else if(ar1[i] > ar2[j]){
                j++;
            }
            else{
                i++;
            }
        }


        return ansList;
    }

    public static void main(String[] args) {
        int ar1[] = {2,3,5,6,7,55,78};
        int ar2[] = {2,5,7,55,65,77,78,86};



        ArrayList <Integer> ar = interSection(ar1,ar2);
        for(int e : ar){
            System.out.println(e);
        }
    }
}
