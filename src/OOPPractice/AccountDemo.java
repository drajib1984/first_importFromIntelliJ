package OOPPractice;

public class AccountDemo {
    public static void main(String[] args) {
        AccountBluePrint ab = new AccountBluePrint(123456,"RAJIB KUMAR DAS",250.00);
        ab.depositAmount(500.00);
        ab.withdrawAmount(1000);
    }
}
