package assignment5;

public class BankAccount 
{
    String owner;
    double balance;
    
    double withdraw;
    double deposit;    
    
    
    BankAccount(String owner, double balance)
    {
        this.owner = owner;
        this.balance = balance;
    }
    
    public void withdraw(double amount)
    {
        balance = balance - amount;
        System.out.printf("%s's Balance after withdraw: %.2f\n" ,owner,balance);
    }
    
    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.printf("%s's Balance after deposit: %.2f\n" ,owner,balance);
    }
    
    
    
}
