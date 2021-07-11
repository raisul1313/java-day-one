package javabasic;

public class Entrypoint {

    public static void main(String[] args) {
        System.out.println(Calculator.add(5,9));
        System.out.println(Calculator.sub(5,9));
        System.out.println(Calculator.mul(5,9));
        System.out.println(Calculator.div(5.0,9.0));
        
        System.out.println(Calculator.isGreaterThan(50));
        System.out.println(Calculator.isLessThan(50));
        System.out.println(Calculator.isGreaterThanEqual(50));
        System.out.println(Calculator.isLessThanEqual(50));
    }
}
    

