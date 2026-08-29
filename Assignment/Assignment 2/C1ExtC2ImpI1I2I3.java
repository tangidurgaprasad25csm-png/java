package Assignment;
interface I1 {
    void method1();
}

interface I2 {
    void method2();
}

interface I3 {
    void method3();
}

class C2 {
    void show() {
        System.out.println("This is C2");
    }
}

class C1 extends C2 implements I1, I2, I3 {

    public void method1() {
        System.out.println("I1 method");
    }

    public void method2() {
        System.out.println("I2 method");
    }

    public void method3() {
        System.out.println("I3 method");
    }
}

public class C1ExtC2ImpI1I2I3 {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.show();      
        obj.method1();   
        obj.method2();   
        obj.method3();   
    }
}
