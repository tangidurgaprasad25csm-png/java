import java.util.InputMismatchException;
import java.util.Scanner;

public class SIOOBE {
    public static void main(String[] args) {
        String name="naveen";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of i to print substring");
        int i=sc.nextInt();
        try{
 System.out.println(name.charAt(i));
            System.out.println(name.substring(i));

        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("value of is equal or less than string length");
        }
        catch(InputMismatchException e){
            System.out.println("enter i value only integer");
        }
    }
}


