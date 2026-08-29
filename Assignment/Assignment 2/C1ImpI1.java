package Assignment;
interface I1{
    int x=100;
    void dispaly();
    void show();
}
class a implements I1{
    @Override
    public void dispaly(){
        System.out.println("it is from interface");
    }
   public void show(){
        System.out.println("method from interface");

    }
}
public class C1ImpI1 {

    public static void main(String[] args) {
        a obj=new a();
        obj.dispaly();
        obj.show();;
        System.out.println(I1.x);
    }
}
