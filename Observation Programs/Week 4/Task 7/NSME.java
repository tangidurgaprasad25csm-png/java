import java.lang.reflect.Method;

public class NSME {
    public static void main(String[] args) {

        try {
            Class<?> c = String.class;

            Method m = c.getMethod("hello");

        }
        catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException occurred");
        }
    }
}
