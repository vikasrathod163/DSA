package Questions.LeetCode;

public class Lt189 {
    public void rotate(int[] nums, int k) {
        int ans[] = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            ans[(i+k)%nums.length] = nums[i];
        }
        int j = 0;
        for(int el : ans){
            nums[j++] = el;

        }
    }
    public static void main(String[] args) {
        System.out.println("Array Rotate");
    }
}
