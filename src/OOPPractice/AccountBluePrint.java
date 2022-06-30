package OOPPractice;

public class AccountBluePrint {
    private long accountNumber;
    private String accountHolderName;
    private static final String BRANCH="Eglinton";
    private double balance;

    public AccountBluePrint(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        System.out.println("Account opening successful");
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositAmount(double amount){
        balance=balance+amount;
        System.out.println(amount+" deposited successfully. The current balance is now "+balance);
    }
    public void withdrawAmount(double withdraw){
        if(withdraw>balance){
            System.out.println("Sorry!! Withdrawal permitted upto: "+balance);
            return;
        }
        else System.out.println("Successfully withdrawn: "+withdraw);
        this.balance= balance-withdraw;
        System.out.println("Current balance now is: "+this.balance);
    }
}
