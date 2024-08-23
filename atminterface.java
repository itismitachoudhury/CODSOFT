import java.util.Scanner;

// Class to represent the user's bank account
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public double checkBalance() {
        return balance;
    }
}

// Class to represent the ATM machine
class ATM {
    private final BankAccount account;
    private final Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. Your new balance is $" + account.checkBalance());
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Deposit successful. Your new balance is $" + account.checkBalance());
    }

    public void checkBalance() {
        System.out.println("Your current balance is $" + account.checkBalance());
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> withdraw();
                case 2 -> deposit();
                case 3 -> checkBalance();
                case 4 -> {
                    System.out.println("Thank you for using the ATM!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class atminterface {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of $1000
        BankAccount account = new BankAccount(1000);

        // Create an ATM object connected to the bank account
        ATM atm = new ATM(account);

        // Run the ATM
        atm.run();
    }
}