 import java.util.Scanner;
 import java.util.InputMismatchException;
 public class IME {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        float b=0;
        
        try{
            System.out.println("enter int value for a");
        a=sc.nextInt();
           System.out.println("enter a float value for b");
         b=sc.nextFloat();
        }
        catch(InputMismatchException e){
            System.out.println("enter proper values of a and b");
        }
        System.out.println("entered values of a and b is :"+a+b);
        sc.close();
        
    }
}

