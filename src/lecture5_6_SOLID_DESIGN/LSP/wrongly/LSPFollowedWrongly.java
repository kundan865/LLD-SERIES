package lecture5_6_SOLID_DESIGN.LSP.wrongly;

import lecture5_6_SOLID_DESIGN.LSP.violated.Account;
import lecture5_6_SOLID_DESIGN.LSP.violated.CurrentAccount;
import lecture5_6_SOLID_DESIGN.LSP.violated.FixedTermAccount;
import lecture5_6_SOLID_DESIGN.LSP.violated.SavingAccount;

import java.util.ArrayList;
import java.util.List;

public class LSPFollowedWrongly {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingAccount());
        accounts.add(new CurrentAccount());
        accounts.add(new FixedTermAccount());

        BankClient client = new BankClient(accounts);
        client.processTransactions();
    }
}
