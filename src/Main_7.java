import java.util.ArrayList;

class Account {
    private String name;
    private String accountNumber;
    private double balance;
    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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
// class called "Bank" with a collection of accounts and methods
// to add and remove
// accounts, and to deposit and withdraw money.
class Bank {
    private ArrayList<Account> accounts;
    public Bank() {
        accounts = new ArrayList<Account>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void removeAccount(Account account) {
        accounts.remove(account);
    }
}
public class Main_7 {
    public static void main(String[] args) {
        Account account1 = new Account("Wojtek", "135843", 5000);
        System.out.println(account1.getAccountInfo());
    }
}
