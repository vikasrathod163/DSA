package Questions.CodeStudio;

public class binarySearch {
    public static  int search(int[] arr,int s ,int e,int key){
        

        if(s > e){
            
            return -1;

        }

        int mid = s + (e - s)/2;

        if(arr[mid] == key){
            return mid;
            
        }
        else if(arr[mid] < key){
            return search(arr, mid + 1, e, key);
        }
        else{
            return search(arr, s, mid - 1, key);
        }
        
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,12};
        int key = 6;
        search(arr, 0, arr.length - 1, key);
        System.out.println("Answer Index : "+search(arr, 0, arr.length - 1, key));
    }
}
