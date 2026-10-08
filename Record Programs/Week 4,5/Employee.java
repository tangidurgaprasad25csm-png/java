public class Employee {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Employee(String name, int id, String designation, double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(designation);
        System.out.println(salary);
        System.out.println(promotionStatus);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Naveen", 101);
        Employee e2 = new Employee("Rahul", 102, "Manager", 50000, "Yes");

        e1.display();
        e2.display();
    }
}

