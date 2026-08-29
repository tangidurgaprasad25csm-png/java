package Assignment;
class C2 {
    void displayC2(){
        System.out.println("this is from C2 class");
    }
}
class C1 extends C2{
    void displayC1(){
        System.out.println("this is from C2 class");
    }
}
public class C1ExtC2 {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.displayC1();
        obj.displayC2();
        
    }
}
