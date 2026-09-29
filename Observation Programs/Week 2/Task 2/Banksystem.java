class Account{ 
    int accNo; 
    String name; 
    int bal; 
    String acctype; 

    // constructor 
    Account(int accNo,String name,int bal,String acctype){ 
        this.accNo=accNo; 
        this.name=name; 
        this.bal=bal; 
        this.acctype=acctype; 
    } 

    // method to deposit money 
    void deposit(int amount){ 
        bal=bal+amount; 
        System.out.println("amount is deposited into account succesfully : "+amount); 
        System.out.println("balance updated to "+bal); 
    } 

    // method to remove money 
    void withdraw(int amount){ 
        if (amount>bal){ 
            System.out.println("balance insufficent"); 
        } 
        else{ 
            bal=bal-amount; 
            System.out.println("withdraw suscessfully :"+amount); 
            System.out.println("balance is upated to :"+bal); 
        } 
    } 

    // to transfer money from one acc to another 
    void transfer(Account name,int amount){ 
        if(amount>bal){ 
            System.out.println("balance insufficent"); 
        } 
        else{ 
            name.bal=name.bal+amount; 
            bal=bal-amount; 
            System.out.println("transacation done successfully"); 
            System.out.println("balance in acc is :"+bal); 
        } 
    } 

    // to present account holder details 
    void accdetail(){ 
        System.out.println("account holder name"+name); 
        System.out.println("account no is "+accNo); 
        System.out.println("balance in account"+bal); 
        System.out.println("account type"+acctype); 
    } 
} 

// creating a class for savings account 
class SavingsAccount extends Account{ 
    double intrate; 

    // constructor 
    SavingsAccount(int accNo,String name,int bal,double intrate){ 
        super(accNo, name, bal, "savings"); 
        this.intrate=intrate; 
    } 

    // method to cal interset rate 
    void interestrate(){ 
        double interest=bal*intrate/100; 
        bal=bal+(int)interest; 
        System.out.println("interest is "+interest); 
        System.out.println("balance after interest is "+bal); 
    } 
} 

// creating a class for current account 
class CurrentAccount extends Account{ 
    int overdraftlimit; 

    // constructor 
    CurrentAccount(int accNo,String name,int bal,int overdraftlimit){ 
        super(accNo,name,bal,"current"); 
        this.overdraftlimit=overdraftlimit; 
    } 

    // overriding withdraw method 
    @Override 
    void withdraw(int amount){ 
        if(amount>bal+overdraftlimit){ 
            System.out.println("withdrawal exceeds overdraft limit"); 
        } 
        else{ 
            bal=bal-amount; 
            System.out.println("withdraw suscessfully :"+amount); 
            System.out.println("balance is upated to :"+bal); 
        } 
    } 
} 

public class Banksystem { 
    public static void main(String[] args){ 

        SavingsAccount s1=new SavingsAccount(101,"vankat",10000,5); 
        CurrentAccount c1=new CurrentAccount(102,"Rahul",5000,3000); 

        System.out.println("----- SAVINGS ACCOUNT DETAILS -----"); 
        s1.accdetail(); 

        System.out.println("\n----- CURRENT ACCOUNT DETAILS -----"); 
        c1.accdetail(); 

        System.out.println("\n----- TRANSACTIONS -----"); 

        s1.deposit(2000); 

        s1.withdraw(1000); 

        s1.interestrate(); 

        c1.deposit(2000); 

        c1.withdraw(9000); 

        s1.transfer(c1,2000); 

        System.out.println("\n----- FINAL ACCOUNT DETAILS -----"); 

        System.out.println("\nSavings Account"); 
        s1.accdetail(); 

        System.out.println("\nCurrent Account"); 
        c1.accdetail(); 
    } 
}