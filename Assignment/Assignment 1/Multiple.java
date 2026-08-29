package Assignment;
interface A {
    void displayA();
}
interface B{
    void displayB();
}
class C implements A,B{
    public void displayA(){
    System.out.println("inherit from interface a");
    }
    public void displayB(){
        System.out.println("inherit from interface b");
    }
    public void displayC(){
        System.out.println("this is from class C");
    }
}
public class Multiple {
    public static void main(String[] args) {
        C obj=new C();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
    
}
   

