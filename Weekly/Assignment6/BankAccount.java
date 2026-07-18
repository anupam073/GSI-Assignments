package Assignment6;

public class BankAccount {
   
    final String ACCOUNT_TYPE = "Savings";
    
   
    long accountNumber;
    String accountHolderName;
    double balance;

    
    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    public void displayAccountDetails() {
        System.out.println("Account Details");
        System.out.println("---------------");
        System.out.println("Account Type      : " + ACCOUNT_TYPE);
        System.out.println("Account Number    : " + accountNumber);
        System.out.println("Account Holder    : " + accountHolderName);
        System.out.println("Balance           : " + balance);
    }

    public static void main(String[] args) {
    
        BankAccount account = new BankAccount(123456789L, "Rohan Sharma", 85000.0);
 
        account.displayAccountDetails();

       // account.ACCOUNT_TYPE = "Current"; 
    }
}