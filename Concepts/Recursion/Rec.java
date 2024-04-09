package Concepts.Recursion;

public class Rec {
    
    public static void numsUptoN(int n){
        if(n == 0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        numsUptoN(n - 1);
        System.out.println(n);
        
    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }

    public static int powerOf2(int n){
        if(n == 0){
            return 1;
        }
        return 2 * powerOf2(n - 1);
    }

    // 0 1 1 2 3 5 8 13 .... n;
    public static void fibo(int f1,int f2){
        if(f1 == 0){
            System.out.print(f1+" "+f2+" ");
            
        }
        if(f2 >= 13){
            return;
        }
        int x = f1 + f2;
        System.out.print(x+" ");
        fibo(f2,x);
    }


    
     public static void main(String[] args) {
        System.out.println("...........Recursion.............");

        numsUptoN(10);
        int n = 5;
        System.out.println("Factorial : "+fact(n));
        System.out.println(powerOf2(5));
        fibo(0,1);
     }
}