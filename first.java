package DSA;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class first {
    public static void main(String[] args) {
        float f[] = {-100
            ,50
            ,0
            ,56.6f
            ,90
            ,0.12f
            ,.12f
            ,02.34f
            ,000.000f};

        for(int i = 0;i < f.length-1;i++){
            for(int j = 0;j < f.length-1-i;j++){
                if(f[j] < f[j+1]){
                    float temp = f[j];
                    f[j] = f[j+1];
                    f[j+1] = temp;
                }
            }
        }

        for(Float a:f){
            System.out.println(a);
        }
    }
}
