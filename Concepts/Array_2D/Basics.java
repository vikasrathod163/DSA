
package Concepts.Array_2D;

import java.util.ArrayList;
import java.util.Scanner;

public class Basics{

    public static void rowSum(int[][] arr){
        System.out.println();
        int x = arr.length;
        int y = arr[0].length;
        
        for(int row = 0;row < x;row++){
            int sum = 0;
            for(int col = 0;col < y;col++){
                sum += arr[row][col];
            }
            System.out.println("Row : "+row+" Sum = "+sum);
        }
    }

    public static void colSum(int[][] arr){
        System.out.println();
        int x = arr.length;
        int y = arr[0].length;

        for(int col = 0;col < y;col++){
            int sum = 0;
            for(int row = 0;row < x;row++){
                sum += arr[row][col];
            }
            System.out.println("Col : "+col+" Sum = "+sum);
        }
    }

    public static int maxRowSum(int[][] arr){
        int x = arr.length;
        int y = arr[0].length;

        int max = -1;
        int maxRowIdx = -1;

        for(int row = 0;row < x;row++){
            int sum = 0;
            for(int col = 0;col < y;col++){
                sum += arr[row][col];
            }
            if(sum > max){
                max = sum;
                maxRowIdx = row;
            }
        }
        return maxRowIdx;
    }

    public static int maxColSum(int[][] arr){
        int x = arr.length;
        int y = arr[0].length;
        int max = -1;
        int maxColIdx = -1;
        for(int col = 0;col < y;col++){
            int sum = 0;
            for(int row = 0;row < x;row++){
                sum += arr[row][col];
            }
            if(sum > max){
                max = sum;
                maxColIdx = col;
            }
        }
        return maxColIdx;
    }

    public static void wavePrint(int[][] arr){
        System.out.println("Original Matrix");
        printMatrix(arr);
        System.out.println();
        System.out.println("Wave Print of the matrix");
        int x = arr.length;
        int y = arr[0].length;

        for(int col = 0;col < y;col++){
            if(col%2 == 0){
                for(int row = 0;row < x;row++){
                    System.out.printf("%5s",arr[row][col]);
                }
                System.out.println();
            }
            else{
                for(int row = x-1;row >= 0;row--){
                    System.out.printf("%5s",arr[row][col]);
                }
                System.out.println();
            }
        }
    }
    
    public static void spiralPrint(int[][] arr){
        System.out.println("Original Matrix");
        printMatrix(arr);
        System.out.println();
        int x = arr.length;
        int y = arr[0].length;

        int startingRow = 0;
        int endingCol = y-1;
        int endingRow = x-1;
        int startingCol = 0;

        int cnt = 0;

        ArrayList<Integer> ans = new ArrayList<>();
        

        while (cnt < (x*y)) {
            for(int i = startingCol;i <= endingCol && cnt < (x*y);i++){
                ans.add(arr[startingRow][i]);
                cnt++;
            }
            startingRow++;
            for(int i = startingRow;i <= endingRow && cnt < (x*y);i++){
                ans.add(arr[i][endingCol]);
                cnt++;
            }
            endingCol--;

            for(int i = endingCol;i >= startingCol && cnt < (x*y);i--){
                ans.add(arr[endingRow][i]);
                cnt++;
            }
            endingRow--;
            
            for(int i = endingRow;i >= startingRow && cnt < (x*y);i--){
                ans.add(arr[i][startingCol]);
                cnt++;
            }
            startingCol++;
        }
        System.out.println("Spriral Print of the Matrix");
        for(int el : ans){
            System.out.print(el+" ");
        }
    }

    public static boolean linearSearch(int[][] arr,int key){
        System.out.println("Linear Search on 2D Matrix");
        System.out.println("key is : "+key);
        int x = arr.length;
        int y = arr[0].length;
        boolean ans = false;

        for(int row = 0;row < x;row++){
            for(int col = 0;col < y;col++){
                System.out.println("Checking..... - "+arr[row][col]);
                if(arr[row][col] == key){
                    ans = true;
                    break;

                }
            }
            if(ans){
                break;
            }
        }
        return ans;
    }

    public static boolean binarySearch(int[][] arr,int key){
        System.out.println("Binary Search on 2D Matrix");
        System.out.println("key is : "+key);

        int x = arr.length;
        int y = arr[0].length;


        int start = 0;
        int end = x*y-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            
            int element = arr[mid/y][mid%y];
            
            if(element == key){
                return true;
            }
            
            if(element < key){
                start = mid + 1;
            }

            if(element > key){
                end = mid - 1;
            }
        }
        return false;
    }

    public static void printMatrix(int[][] arr){
        int x = arr.length;
        int y = arr[0].length;

        
        for(int row = 0;row < x;row++){
            for(int col = 0;col < y;col++){
                int el = arr[row][col];
                System.out.printf("%5s",el);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to 2D Array!");

        // Declaration and initialization of 2D array
        int arr[][] = new int[3][3];

        // Assigning values individualy
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        // arr[2][2] = 9;

        System.out.println("value at arr[0][0] : "+arr[0][0]);
        System.out.println("value at arr[0][0] : "+arr[1][0]);
        System.out.println("value at arr[0][0] : "+arr[0][2]);
        System.out.println("value at arr[0][0] : "+arr[2][2]); // default initialization is 0



        // getting dimension of 2D array
        System.out.println("No of Rows : "+arr.length);
        System.out.println("No of Cols : "+arr[0].length);

        int arr2[][] = new int[4][4];
        int nRow = arr2.length;
        int nCol = arr2[0].length;


        Scanner sc = new Scanner(System.in);
        System.out.println(nRow+" "+nCol);
        
        // Assigning values using for loop or getting input as a 2D array

        System.out.println("Enter Array element : ");
        for(int row = 0;row < nRow;row++){
            for(int col = 0;col < nCol;col++){
                arr2[row][col] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matrix 1\n");
        printMatrix(arr2);
        

        rowSum(arr2);
        colSum(arr2);

        System.out.println();
        System.out.println("Row index of max row sum : "+maxRowSum(arr2));

        System.out.println("Col index of max col sum : "+maxColSum(arr2));


        wavePrint(arr2);

        System.out.println();
        spiralPrint(arr2);
        System.out.println();

        System.out.println("Matrix");
        printMatrix(arr2);

        System.out.println(linearSearch(arr2, 5));
        System.out.println(binarySearch(arr2,55));


        int[][] arr3 = {
            {1,7,9,15},
            {2,8,10,16},
            {4,13,17,20},
            {6,18,19,22}
        };

        System.out.println("Col and Row wise sorted matrix");;
        printMatrix(arr3);

        boolean a = bSearch(arr3,60);
        System.out.println(a);

     
        sc.close();
    }

    public static boolean bSearch(int[][] arr,int key){
        System.out.println("Special Search");
        System.out.println("key is : "+key);

        int x = arr.length;
        int y = arr[0].length;

        int i = 0;
        int j = y-1;

        while (i < x && j >= 0) {
            int element = arr[i][j];
            if(element == key){
                return true;
            }
            else if(element < key){
                i++;
            }
            else{
                //(element > key)
                j--;
            }
        }
        return false;
    }
}