package classbasic;

public class BasicClass {

    public static void main(String[] args) {
        Student s = new Student(); //user define type   
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
      
        s.name = "Raisul";
        s.seid = 54454;
        s.phone = "1234567899";
        
        System.out.println(s.name);
        System.out.println(s.seid);
        System.out.println(s.phone);
        
        System.out.println("");
        
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        
    } 
}
