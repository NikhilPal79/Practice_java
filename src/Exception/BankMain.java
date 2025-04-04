package Exception;

public class BankMain {
    public static void main(String[] args) {

        Bank b1 = new Bank();
        b1.showBalance();
        System.out.println();
        b1.showDeposit();
        System.out.println();
        b1.showWithdraw();

        System.out.println("check");

    }
}
