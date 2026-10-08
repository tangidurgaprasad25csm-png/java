import java.util.Scanner;

interface Employee {
    void salaryDetails();
}

class RegularEmployee implements Employee {
    public void salaryDetails() {
        int basic = 25000;
        int hra = 15000;
        int ta = 5000;
        int total = basic + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

class ContractEmployee implements Employee {
    public void salaryDetails() {
        int basic = 12000;
        int hra = 0;
        int ta = 3000;
        int total = basic + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

class Vendor implements Employee {
    public void salaryDetails() {
        System.out.println("Vendor salary details are not available.");
    }
}

public class InheritanceLabPro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String id = sc.nextLine();

        Employee employee;

        if (id.startsWith("R")) {
            employee = new RegularEmployee();
        }
        else if (id.startsWith("C")) {
            employee = new ContractEmployee();
        }
        else if (id.startsWith("V")) {
            employee = new Vendor();
        }
        else {
            System.out.println("Invalid Employee Id");
            sc.close();
            return;
        }

        employee.salaryDetails();

        sc.close();
    }
}
