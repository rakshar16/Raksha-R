public class CurrentAccount extends BankAccount {

    private final double serviceCharge = 200;

    public CurrentAccount(String name, double initialBalance) {
        super(name, initialBalance);
    }

    public void deductServiceCharge() {
        double balance = getBalance();

        if (balance >= serviceCharge) {
            balance -= serviceCharge;
            setBalance(balance);

            System.out.println("Service Charge Deducted: ₹" + serviceCharge);
            System.out.println("New Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
