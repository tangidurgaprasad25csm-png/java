import java.util.Scanner;
public class NumberFormatExceptions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter proper string to convert into integer");
        try{
        String s=sc.next();
        int num=Integer.parseInt(s);
        System.out.println("string is converted into int is : "+num);
        }
        catch(NumberFormatException e){
            System.out.println("give proper string value to convert");
            
        }
        
    }
}
