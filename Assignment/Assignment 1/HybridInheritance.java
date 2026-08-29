package Assignment;
interface A {
    void showA();
}

interface B extends A {
    void showB();
}

interface C extends A {
    void showC();
}

class D implements B, C {
    public void showA() {
        System.out.println("this is from interface A");
    }

    public void showB() {
        System.out.println("inherut from interface B");
    }

    public void showC() {
        System.out.println("inherit from interface  C");
    }
    void showD(){
        System.out.println("this from class D");
    }

}

public class HybridInheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.showA();
        obj.showB();
        obj.showC();
        obj.showD();
    }
}
