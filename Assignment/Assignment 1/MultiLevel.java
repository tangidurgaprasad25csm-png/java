package Assignment;
class A{
    int x=10;
    int y=20;
    void sum(){
        System.out.println("sum is"+(x+y));
    }
}
class B extends A{
    int y=30;
    void display(){
        System.out.println("this is from b"+y);
     }
     void play(){
        System.out.println("this is from class a"+x);
     }
}
class C extends B{
    void show(){
        System.out.println("value of y from class b"+y);
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        C obj=new C();
        obj.show();
        obj.play();
        obj.display();
        obj.sum();

    }
}
