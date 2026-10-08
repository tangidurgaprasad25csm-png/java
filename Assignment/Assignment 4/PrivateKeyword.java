package Assignmemt 4;

class Account {
    private int balance = 5000;

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Privatekeyword {
    public static void main(String[] args) {
        Account a = new Account();

        a.showBalance();
    }
}
