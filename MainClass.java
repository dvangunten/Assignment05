package assignment5;

public class MainClass 
{
    
    public static void main(String[] args)
    {
       SavingsAccount joeSavingsAccount = new SavingsAccount("Joe", 100, .01); 
       CheckingAccount emilyCheckingAccount = new CheckingAccount("Emily", 200, 10);
       SavingsAccount samSavingsAccount = new SavingsAccount("Sam", 250,.05);
       
       System.out.printf("Starting Balances- \n"
               + "Emily: %.2f\n"
               + "Joe: %.2f\n"
               + "Sam: %.2f\n",emilyCheckingAccount.balance,joeSavingsAccount.balance,samSavingsAccount.balance);
       
       emilyCheckingAccount.deposit(50);
       joeSavingsAccount.withdraw(25);
       emilyCheckingAccount.processCheck(50);
       
       emilyCheckingAccount.withdraw(100);
       joeSavingsAccount.deposit(100);
       
       joeSavingsAccount.depositMonthlyInterest();
       samSavingsAccount.depositMonthlyInterest();
       emilyCheckingAccount.withdraw(500);
       joeSavingsAccount.withdraw(500);
       
       
    }
    
}
