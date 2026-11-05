package lecture5_6_SOLID_DESIGN.LSP.followed;

public interface WithdrawableAccount extends DepositOnlyAccount {
    void withdraw(double amount);
}
