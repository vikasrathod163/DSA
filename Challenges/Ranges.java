package Challenges;

class Range{

    public void longg(){
        System.out.println("Range : "+(-(Math.pow(2,63)))+" to "+(Math.pow(2,63)-1));
    }

    public void integer(){
        System.out.println("Range : "+(-(Math.pow(2,31)))+" to "+(Math.pow(2,31)-1));
    }

    public void shrt(){
        System.out.println("Range : "+(int)(-(Math.pow(2,15)))+" to "+(int)(Math.pow(2,15)-1));
    }

    public void byt(){
        System.out.println("Range : "+(int)(-(Math.pow(2,7)))+" to "+(int)(Math.pow(2,7)-1));
    }
    
}
public class Ranges {
    public static void main(String[] args) {
        Range range = new Range();

        range.longg();
        range.integer();
        range.shrt();
        range.byt();

        System.out.println(Float.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
