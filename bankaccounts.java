class BankAccount {
    String name;
    int accountNumber;
    double balance;

    // Deposit money
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display account details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount a = new BankAccount();

        a.name = "DHEERAJ YAMMANI";
        a.accountNumber = 1234567890;
        a.balance = 10000;

        a.deposit(2500);
        a.withdraw(1500);

        a.display();
    }
}