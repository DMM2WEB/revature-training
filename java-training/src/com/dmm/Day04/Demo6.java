package com.dmm.Day04;

interface WorldBank2 {
    boolean deposit (int amount);
    boolean withdraw (int amount);
    void getBalance ();
}

// when using interface, it is forcing the class to implement required methods

class SavingsAccount implements WorldBank2 {
    private int _balance;
    // local variable to track the balance
    private int _perDayLimit;
    // local variable to track the per day limit

    @Override
    public boolean deposit (int amount) {
        _balance += amount;
        System.out.println("Successfully deposit: " + amount);
        return true;
    }

    @Override
    public boolean withdraw (int amount) {
        // check the amount request for withdraw, which should be more than balance
        if (_balance < amount) {
            System.out.println("Insufficient funds");
            return false;
        }

        //per day limit withdraw is 5000

        else if (_perDayLimit + amount > 5000) {
            // check the per day limit, which should be less than 5000
            System.out.println("Withdraw attempt failed, you have exceeded per day limit");
            return false;
        }

        else {
            _balance -= amount;
            //redux the balance with amount withdraw
            _perDayLimit += amount;
            //add amount to per day limit
            System.out.println("Successfully withdraw: " + amount);
            return true;
        }
    }

    @Override
    public void getBalance () {
        System.out.println("Savings account balance: " + _balance);
    }
}

class CurrentAccount implements WorldBank2 {
    private int _balance;

    @Override
    public boolean deposit (int amount) {
        _balance += amount;
        System.out.println("Successfully deposit: " + amount);
        return true;
    }

    @Override
    public boolean withdraw (int amount) {
        if (_balance < amount) {
            System.out.println("Insufficient funds");
            return false;
        }

        else {
            _balance -= amount;
            System.out.println("Successfully withdraw: " + amount);
            return true;
        }
    }

    @Override
    public void getBalance () {
        System.out.println("Current account balance: " + _balance);
    }
}

public class Demo6 {
    public static void main(String[] args) {
        WorldBank2 savingsAccount = new SavingsAccount();
        WorldBank2 currentAccount = new CurrentAccount();

        savingsAccount.deposit(2000);
        savingsAccount.withdraw(1000);
        savingsAccount.withdraw(6000);
        savingsAccount.deposit(5000);
        savingsAccount.withdraw(5000);
        savingsAccount.getBalance();

        System.out.println();

        currentAccount.deposit(5000);
        currentAccount.withdraw(6000);
        currentAccount.deposit(10000);
        currentAccount.withdraw(6000);
        currentAccount.getBalance();
    }
}
