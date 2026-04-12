class BankAccount {
    private String name;
    private int accNo;
    private double balance;

    public void setDetails(String n, int a, double b) {
        name = n;
        accNo = a;
        balance = b;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

public class bankaccount {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setDetails("Ravi", 12345, 5000);
        b.deposit(2000);
        b.withdraw(3000);
        b.display();
    }
}