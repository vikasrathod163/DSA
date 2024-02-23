package Concepts.DataTypes;

public class Conversions {
    public static void main(String[] args) {
        //Conversions of Data Types

        // Implicit Typecasting - it is done Implicitly by java ex. int to float , float to double , int to long , means - big to small

        // Explicit Typecasting - by us

        // int to short

        int i = 23;
        // short s = i; error

        short s = (short)i;
        System.out.println(s);

        //double to float

        double d = 34.3f;
        float f = (float)d;
        System.out.println(f);

        int a = 'a';
        System.out.println(a);
    }
}
