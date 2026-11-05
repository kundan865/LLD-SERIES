package lecture5_6_SOLID_DESIGN.LSP.followed;

public class FixedTermAccount implements DepositOnlyAccount {
    private double balance;

    public FixedTermAccount() {
        balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount +
                " in Fixed Term Account. New Balance: " + balance);
    }
}
