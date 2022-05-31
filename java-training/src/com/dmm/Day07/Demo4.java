package com.dmm.Day07;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException () {
        System.out.println("Insufficient amount requested");
    }

    public InsufficientFundsException (String message) {
        super(message);
        //System.out.println(message);
    }
}

class BankAccount {
    private int balance = 0;
    private int accountNumber;

    public BankAccount (int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit (int amount) {
        balance += amount;
        System.out.println("Amount credited: " + amount);
    }

    public void withdraw (int amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount debited: " + amount);
        }

        else {
            throw new InsufficientFundsException("This is an invalid request");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456);
        System.out.println(account.getBalance());
        account.deposit(5000);

        try {
            account.withdraw(2000);
        }

        catch (InsufficientFundsException e) {
            e.printStackTrace();
        }

        account.deposit(1000);

        try {
            account.withdraw(10000);
        }

        catch (InsufficientFundsException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
