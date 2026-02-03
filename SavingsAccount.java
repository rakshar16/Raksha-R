public class SavingsAccount extends BankAccount {

    private final double interestRate = 0.05;

    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
    }

    public void addInterest() {
        double balance = getBalance();
        balance += balance * interestRate;
        setBalance(balance);

        System.out.println("Interest Added!");
        System.out.println("New Balance: ₹" + balance);
    }
}

