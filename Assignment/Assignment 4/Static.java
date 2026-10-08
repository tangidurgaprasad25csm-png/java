package Assignment 4;

class Static {
    String name;
    static String college = "ANITS";

    Static(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + college);
    }

    public static void main(String[] args) {
        Static s1 = new Static("JAIRAM");
        Static s2 = new Static("Rahul");

        s1.display();
        s2.display();

        Static.college = "AU";

        s1.display();
        s2.display();
    }
}
