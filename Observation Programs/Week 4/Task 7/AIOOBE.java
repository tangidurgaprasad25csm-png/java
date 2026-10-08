import java.util.Scanner;
public class AIOOBE {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] arr = {10, 20, 30, 40, 50};
 System.out.print("Enter index: ");
        int index = sc.nextInt();
 try {
            System.out.println("Value = " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
        }
 System.out.println("Done");
 sc.close();
    }
}
