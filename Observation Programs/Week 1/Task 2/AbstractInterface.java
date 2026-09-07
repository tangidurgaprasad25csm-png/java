abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

interface Printable {
    void print();
}

class Report implements Printable {
    public void print() {
        System.out.println("Printing Report");
    }
}

public class AbstractInterface {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();

        c.draw();
        r.draw();

        Report report = new Report();
        report.print();
    }
}


    

