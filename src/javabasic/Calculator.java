package javabasic;

public class Calculator {
    
    public static int add( int a, int b){
        return a + b;
    }
    public static int sub( int a, int b){
        return a - b;
    }
    public static int mul( int a, int b){
        return a * b;
    }
    public static double div( double a, double b){
        if ( b == 0){
            System.out.println("Wrong 2nd argument");
            return 0.0;
      }
        return a / b; 
    }
        public static boolean isGreaterThan(int a){
        return a > 90; 
    }
   
    public static boolean isLessThan(int a){
        return a < 90; 
    }
    
    public static boolean isGreaterThanEqual(int a){
        return a >= 90; 
    }
    
    public static boolean isLessThanEqual (int a){
        return a <= 90; 
    }  
}
