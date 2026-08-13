interface I {
    int a=20;
    
    void method1();
}

class Sam {
    int b=30;

    void method2(){
        System.out.println("this is method 2 :");
    }
}

public class Interface2 extends Sam implements I{
    @Override
    public void method1(){
        System.out.println("this is method 1 :");
    }

    public int add(int x,int y){
        return(x+y);
    }
    
    public static void main(String[] args) {
        Interface2 obj = new Interface2();
        obj.method1();
        obj.method2();
        System.out.println("result =" + obj.add(I.a,obj.b));            
        }
    
}