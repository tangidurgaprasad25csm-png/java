class A{
    int x=10;
    void add(){
        system.out.println("add from first is:"+(x+20));
    }
}
class B extends A {
    int y=200;
    void sub(){
        system.out.println("sub from second id:"+(y-20));
    }
}
public class Single{
    public static void main(String[] args){
        B obj=new B();
        system.out.println("varible:"+obj.x);
        obj.add();
        obj.sub();
    }
}