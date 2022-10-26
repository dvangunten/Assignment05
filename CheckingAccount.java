package assignment5;

public class CheckingAccount extends BankAccount
{
    double insufficientFundsFee;

    public CheckingAccount(String owner, double balance,double insufficientFundsFee)
    {
        super(owner, balance);
        this.insufficientFundsFee = insufficientFundsFee;
    }
    
    
    
    public void processCheck(double CheckAmount)
    {
        balance = balance + CheckAmount;
        System.out.printf("%s's Balance after processing check: %.2f\n" ,owner,balance);
    }
    
    @Override
    public void withdraw(double amount)
    {
        balance = balance - amount;
        System.out.printf("%s's Balance after withdraw: %.2f\n" ,owner,balance);
        if(balance < 0)
        {
            balance = balance - insufficientFundsFee;
            System.out.printf("Insufficient Funds Fees Apply\n"
                    + " > %s's New Balance: %.2f\n" ,owner,balance);
        }
    }
}
