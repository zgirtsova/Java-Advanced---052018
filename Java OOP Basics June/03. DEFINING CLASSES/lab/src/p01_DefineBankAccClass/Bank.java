package p01_DefineBankAccClass;

import java.util.HashMap;
import java.util.Map;

class Bank {

    private Map<Integer, BankAccount> accounts;

    Bank() {
        super();
        this.accounts = new HashMap<>();
    }

    boolean hasAccount(int id) {
        return this.accounts.containsKey(id);
    }

    boolean createAccount(int id) {
        if (hasAccount(id)) {
            return false;
        }
        BankAccount account = new BankAccount(id);
        this.accounts.put(id, account);
        return true;
    }

    BankAccount getAccount(int id) {
        return this.accounts.get(id);
    }
}
