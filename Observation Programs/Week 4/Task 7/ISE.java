public class ISE {

    boolean started = false;

    void drive() {

        if (!started) {
            throw new IllegalStateException("Car is not started");
        }

        System.out.println("Car is driving");
    }

    public static void main(String[] args) {

        ISE c = new ISE();

        c.drive();
    }
}

