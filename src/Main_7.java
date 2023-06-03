import java.util.ArrayList;

class Account {
    private final String name;
    private final String accountNumber;
    private double balance;
    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public String getAccountInfo() {
        return name + ' ' + accountNumber + ' ' + balance;
    }
}
// and to deposit and withdraw money.
class Bank {
    private final ArrayList<Account> accounts;
    public Bank() {
        accounts = new ArrayList<>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void depositMoney(Account account, double amount) {
        account.deposit(amount);
    }
    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
public class Main_7 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("Peter Irmgard", "C0011", 5000);
        Account account2 = new Account("Katja Ruedi", "C0121", 4500);
        Account account3 = new Account("Marcella Gebhard", "C0222", 20000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList<Account> accounts = bank.getAccounts();

        for (Account account: accounts) {
            System.out.println(account.getAccountInfo());
        }

        System.out.println("\nAfter depositing 1000 into account1:");
        bank.depositMoney(account1, 1000);
        System.out.println(account1.getAccountInfo());
        System.out.println("No transaction in account2:");
        System.out.println(account2.getAccountInfo());
        System.out.println("After withdrawing 5000 from account3:");
        bank.withdrawMoney(account3, 5000);
        System.out.println(account3.getAccountInfo());
    }
}
