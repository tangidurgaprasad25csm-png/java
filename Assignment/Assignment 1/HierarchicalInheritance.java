package Assignment;
class A{
    int x=10;
    int y=20;
    void sum(){
        System.out.println("sum is "+(x+y));
    }
}
class B extends A{
    void display(){
        System.out.println("this is one sub class");
    }
    void show(){
        System.out.println(x);
    }
}
class C extends A{
    void display(){
        System.out.println("this is second sub class");
    }
    void show(){
        System.out.println(y);
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        B obj=new B();
        C obj1=new C ();
        obj.sum();
        obj1.sum();
        obj.display();
        obj.show();
    }
}
