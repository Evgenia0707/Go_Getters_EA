package day_0720.fundsException;

public class CheckingAccount {
    private double balance;
    private final int accountNumber;

    public CheckingAccount(int number) {
        this.accountNumber = number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {//create for snow user
        if(amount <= balance) {
            balance -= amount;
        }else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);//
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
