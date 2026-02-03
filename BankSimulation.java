import java.util.Scanner;

public class BankSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Deposit: ");
        double initialDeposit = sc.nextDouble();

        if (choice == 1) {
            account = new SavingsAccount(name, initialDeposit);
        } else if (choice == 2) {
            account = new CurrentAccount(name, initialDeposit);
        } else {
            System.out.println("Invalid Choice!");
            return;
        }

        int option;

        do {
            System.out.println("\nChoose Operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Add Interest / Deduct Charges");
            System.out.println("5. Exit");

            option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    System.out.println("Current Balance: ₹" + account.getBalance());
                    break;

                case 4:
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).addInterest();
                    } else if (account instanceof CurrentAccount) {
                        ((CurrentAccount) account).deductServiceCharge();
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Bank System!");
                    break;

                default:
                    System.out.println("Invalid Option!");
            }

        } while (option != 5);

        sc.close();
    }
}
