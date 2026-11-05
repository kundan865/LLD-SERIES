package lecture5_6_SOLID_DESIGN.LSP.wrongly;

import lecture5_6_SOLID_DESIGN.LSP.violated.Account;
import lecture5_6_SOLID_DESIGN.LSP.violated.FixedTermAccount;

import java.util.List;

class BankClient {
    private List<Account> accounts;

    public BankClient(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void processTransactions() {
        for (Account acc : accounts) {
            acc.deposit(1000);

            // Checking account type explicitly
            if (acc instanceof FixedTermAccount) {
                System.out.println("Skipping withdrawal for Fixed Term Account.");
            } else {
                try {
                    acc.withdraw(500);
                } catch (UnsupportedOperationException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
            }
        }
    }
}
