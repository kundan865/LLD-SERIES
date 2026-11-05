package lecture5_6_SOLID_DESIGN.LSP.violated;

import java.util.ArrayList;
import java.util.List;


public class LSPViolated {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingAccount());
        accounts.add(new CurrentAccount());
        accounts.add(new FixedTermAccount());

        BankClient client = new BankClient(accounts);
        client.processTransactions(); // Throws exception when withdrawing from FixedTermAccount
    }
}
