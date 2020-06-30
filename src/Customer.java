
/**
 *
 * @author Sam Scott
 */
public class Customer {

    private String name;
    private Account account1, account2;

    public Customer(String name) {
        this(name, null, null);
    }

    public Customer(String name, Account account1) {
        this(name, account1, null);
    }

    public Customer(String name, Account account1, Account account2) {
        this.name = name;
        this.account1 = account1;
        this.account2 = account2;
    }

    public Account getAccount(int accountNum) {
        if (accountNum == 1) {
            return account1;
        }
        return account2;
    }

    public void deposit(int accountNum, double amount) {
        if (accountNum == 1) {
            account1.deposit(amount);
        } else {
            account2.deposit(amount);
        }
    }

    public void withdraw(int accountNum, double amount) {
        if (accountNum == 1) {
            account1.withdraw(amount);
        } else {
            account2.withdraw(amount);
        }
    }

    public String toString() {
        return "Customer:\n  " + name + ".\nAccounts: \n  " + account1 + "\n  " + account2;
    }
}
