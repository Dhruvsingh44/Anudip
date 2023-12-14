public class Bank {
    private double amount;

    // Parameterized constructor to initialize 'amount'
    public Bank(double initialAmount) {
        amount = initialAmount;
    }

    // Method to withdraw funds
    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(message);

        // Update the balance if withdrawal is successful
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
    }

    // Method to deposit funds
    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    // Method to display the total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        // Create a Bank object with an initial balance of 10,000
        Bank account = new Bank(10000);

        // Withdraw 5000 from the account
        account.withdraw(5000);

        // Deposit 5000 into the account
        account.deposit(5000);

        // Display the total balance
        account.displayBalance();
    }
}
