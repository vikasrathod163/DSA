package Patterns;

public class Pat {

    public static void p1(int n){
        
        
        for(int i = 0; i < n; i++){
            for(int j = 0;j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p2(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void p3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((n-j+1)+" ");
            }
            System.out.println();
        }
    }

    public static void p4(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p5(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void p6(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i+j-1+" ");
            }
            System.out.println();
        }
    }

    public static void p7(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((i-j+1)+" ");
            }
            System.out.println();
        }
    }

    public static void p8(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                char ch = (char)('A'+i-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void p9(int n){
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                char ch = (char)('A'+cnt);
                System.out.print(ch+" ");
                cnt++;
            }
            System.out.println();
        }
    }

    public static  void p10(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                char ch = (char)('A'+i+j-2);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void p11(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                char ch = (char)('A'+i-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void p12(int n){
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                char ch = (char)('A'+cnt);
                System.out.print(ch+" ");
                cnt++;
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        p12(4);
    }
}
