package basicloops;

public class LoopMain {
    public static void main(String[] args) {
         for (int i = 1; i <= 10; i++) {  //For 1 to 10 
             System.out.println(i);   
        }
    System.out.println("");
    
    int count = 11;          //Will print 11 to 20
    while(count <= 20){
        System.out.println(count);
        count ++;
        }
    System.out.println("");
    
    int count1 = 15;        // Atleast visit 1 time, condition did't apply
    
    do{
        System.out.println(count1);
    }
    while(count1 <=10);
   
    System.out.println("");
    
    int[] number = {1,2,3,4,5,6,7,8,9,10};
    System.out.println("Length");
    System.out.println(number.length);
    
    System.out.println("");
    
    int[] number1 = {1,2,3,4,5,6,7,8,9,10};
    for(int n : number1){
        System.out.println(n*2);
    }

    System.out.println("");
    }
}


