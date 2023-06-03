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

class Bank {
    private static final ArrayList<Bank> accountsCollection = new ArrayList<Bank>();
    public static void addAccounts(Bank bank) {
        accountsCollection.add(bank);
    }
    public static void removeAccounts(Bank bank) {
        accountsCollection.remove(bank);
    }

    public static ArrayList<Bank> getAccountsCollection() {
        return accountsCollection;
    }
}
public class Main_7 {
    public static void main(String[] args) {
        Account account1 = new Account("Wojtek", "135843", 5000);
        System.out.println(account1.getAccountInfo());
    }
}
