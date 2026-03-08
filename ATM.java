import java.util.Scanner;

public class ATM  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Current Balance: ₹" + balance);
            } 
            else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                int amount = sc.nextInt();
                balance += amount;
                System.out.println("Amount Deposited Successfully");
            } 
            else if (choice == 3) {
                System.out.print("Enter withdraw amount: ");
                int amount = sc.nextInt();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdraw Successful");
                } else {
                    System.out.println("Insufficient Balance");
                }
            } 
            else if (choice == 4) {
                System.out.println("Thank you for using ATM");
            } 
            else {
                System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}
