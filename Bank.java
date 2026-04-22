public class Bank {
    // Bank class implementation, deposit, withdraw.

    // start implementation
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    // end implementation

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(2000);
        System.out.println("Balance after deposit: " + bank.getBalance());
        bank.withdraw(800);
        System.out.println("Balance after withdrawal: " + bank.getBalance());
    }
}