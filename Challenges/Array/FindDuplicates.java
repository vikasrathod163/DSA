package Challenges.Array;

import java.util.ArrayList;

public class FindDuplicates {
    public static ArrayList <Integer> findDs(int arr[]){
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){

            int index = Math.abs(arr[i])- 1;

            if(arr[index]< 0){
                list.add(Math.abs(arr[i]));
            }
            arr[index] = -(arr[index]);
        }
        return list;
    }
    public static void main(String[] args) {
        int a[] = {1,2,4,5,2,3,3,4};

        // n = length of array
        // where elements of array are from 1 to n
        
        ArrayList <Integer> l = findDs(a);
        for(int e : l){
            System.out.println(e);
        }
    }
}
