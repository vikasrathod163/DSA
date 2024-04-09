package Questions.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static void solve(int[] arr,ArrayList<Integer> output, int index, ArrayList< ArrayList<Integer> > ans){

        // Base case
        if(index >= arr.length){
            System.out.println(
                "added"
            );
            System.out.println(output);
            ans.add(output);
            return;
        }

        // exclude call

        solve(arr,output,index+1,ans);

        // include call

        int el = arr[index];
        output.add(el);
        solve(arr,output,index+1,ans);
    }

    public static ArrayList<ArrayList<Integer>>  powerSet(int[] arr){

        ArrayList< ArrayList<Integer> > ans = new ArrayList<>();

        ArrayList <Integer> output = new ArrayList<>();
        
        int index = 0;

        solve(arr,output,index,ans);
        return ans;
    }

    public static void powerSetUsingBitMan(int[] nums){
       ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

       int n = nums.length;
       for(int i = 0;i < (2<<n);i++){
        ArrayList<Integer> out = new ArrayList<>();
            for(int j = 0;j < n;j++){
                

                if(((1<<j)&i) == 1){
                    out.add(nums[j]);
                    System.out.println(out);
                }
                
            }
       }

       
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //ArrayList< ArrayList<Integer> > ans = powerSet(arr);
        powerSetUsingBitMan(arr);

        // System.out.println(ans.get(0));
        // System.out.println(ans.get(4));
        
    }
}
