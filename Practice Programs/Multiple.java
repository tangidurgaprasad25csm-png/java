class A{
    int x=10;
    float calc_si(float p,int t,float r){
        float si=(p*t*r)/100;
        return si;
    }
}
class B extends A{
    @Override
    float calc_si(float p,int t,float r){
        float si=(p*t*r)/10;
        return si;
    }
    void access(){
        float result=calc_si(1000,2,2.56f);
        system.out.println("si value is:"+result);
    }
}
class C extends A{
    @Override
    float calc_si(float p,int t,float r){
        float si=(p*t*r)/1000;
        return si;
    }
    void access(){
        float result=calc_si(1000,2,);
        system.out.println("si value is:"+result);
    }
}
public class Multiple{
    public static void main(String[] args){
        B b=new B();
        C c=new C();
        c. access();
    }
}
    