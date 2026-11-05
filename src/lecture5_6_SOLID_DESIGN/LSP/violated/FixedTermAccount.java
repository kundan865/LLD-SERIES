package lecture5_6_SOLID_DESIGN.LSP.violated;

public class FixedTermAccount implements Account {
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

    @Override
    public void withdraw(double amount) {
        throw new
                UnsupportedOperationException(
                        "Withdrawal not allowed in Fixed Term Account!");
    }
}