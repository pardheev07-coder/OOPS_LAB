class Bank {

    // Cash deposit
    void deposit(double amount) {
        System.out.println("Cash Deposit: Rs." + amount);
    }

    // Cheque deposit
    void deposit(String chequeNo, double amount) {
        System.out.println("Cheque Deposit: Cheque No = " + chequeNo + ", Amount = Rs." + amount);
    }

    // Online transfer
    void deposit(String accountNo, double amount, String mode) {
        System.out.println("Online Transfer: Account No = " + accountNo + ", Amount = Rs." + amount + ", Mode = " + mode);
    }

    public static void main(String[] args) {
        Bank b = new Bank();

        b.deposit(5000); // Cash
        b.deposit("CHQ12345", 10000); // Cheque
        b.deposit("ACC98765", 15000, "UPI"); // Online
    }
}