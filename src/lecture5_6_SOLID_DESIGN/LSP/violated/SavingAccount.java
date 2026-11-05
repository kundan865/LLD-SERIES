package lecture5_6_SOLID_DESIGN.LSP.violated;

public class SavingAccount implements Account {

    private double balance;

    public SavingAccount() {
        balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount +
                " in Savings Account. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount +
                    " from Savings Account. New Balance: " + balance);
        } else {

            System.out.println("Insufficient funds in Savings Account!");
        }
    }
}
