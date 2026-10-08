public class ASE {
    public static void main(String[] args) {

        Object[] arr = new String[3];

        arr[0] = "Hello";
        arr[1] = "Java";

        try {
            arr[2] = 100;
        }
        catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException occurred");
        }
    }
}

