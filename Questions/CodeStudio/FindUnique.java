package Questions.CodeStudio;

public class FindUnique {
    public static int unique(int arr[]){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            ans = ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {

    int ar[] = {2,3,3,4,2,4,8};
    int ans = unique(ar);
    
    System.out.print("Unique : "+ans);

    }
}
