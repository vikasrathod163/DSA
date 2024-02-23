package Concepts.Functions;

public class fun {

    // Writing function defination here

    public static void msg(){
        System.out.println("Hello Java");
    }

    public static void add(int a,int b){
        System.out.println("Addition is : "+(a+b));
    }

    public static void printNumbers(int n){
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }

    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }
    // isPrime function

    // Function with return value - the type of return value can be of any primitive data types - int,short,byte,long etc.
    public static boolean isPrime(int n){
        boolean ans = true;

        for(int i = 2; i < n; i++){
            if(n%i == 0){
                ans = false;
                return ans;
            }
        }
        return ans;
    }


    public static int pow(int a,int b){
        int p = 1;
        for(int i = 0; i < b; i++){
            p = p * a;
        }
        return p;
    }

    public static long fact(int n){
        long fact = 1;

        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static long nCr(int n, int r){
        long upper = fact(n);
        long lower = (fact(r)*(fact(n-r)));
        long ans = upper/lower;
        return ans;
    }

    public static void main(String[] args) {
        msg();
        add(5,4);
        printNumbers(10);

        System.out.println(isPrime(15));

        System.out.println(pow(0, 0));

        System.out.println(isEven(5));

        System.out.println(fact(6));

        System.out.println(nCr(20, 2));
       
       
    }
}
