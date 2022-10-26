package assignment5;

public class SavingsAccount extends BankAccount 
{

     
    
        double annualInterestRate;

        public SavingsAccount(String owner, double balance, double annualInterestRate)
        {
            super(owner, balance);
            this.annualInterestRate = annualInterestRate;
        }
        
        
        
        public void depositMonthlyInterest()
        {
            balance = balance + ((annualInterestRate / 12) * balance);
            System.out.printf("%s's Balance after monthly interest: %.2f\n" ,owner,balance);
        }
        @Override
        public void withdraw(double amount)
        {
            if(balance  >= amount)
            {
                balance = balance - amount;
                System.out.printf("%s's Balance after withdraw: %.2f\n" ,owner,balance);
            }
            if(balance < amount)
            {
                System.out.printf("Insufficient funds.\n"
                        + " > %s's Balance: %.2f\n"  ,owner,balance);
            }
        }
    
    
    
    
}
