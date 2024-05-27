package com.thread;

class BankAccounts {
    private double balance;

    public BankAccounts(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amount) {
        System.out.println("Depositing " + amount + "₹");

        double newBalance = balance + amount;
        try {
            Thread.sleep(700);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
        balance = newBalance;
        System.out.println("Balance after depositing : " + balance + "₹");
    }

    public synchronized void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + "₹");

        if(amount>balance){
            System.out.println("Insufficient Balance. Please deposit first");
            try {
                wait(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(amount>balance){
            System.out.println("Still Insufficient Balance. Try again later");
            return;
        }
        double newBalance = balance - amount;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println("Withdrawn "+amount+ "₹");
        balance = newBalance;
        System.out.println("Balance after withdrawing : " + balance + "₹");

    }

}

class DepositThreads implements Runnable {
    private BankAccount account;
    private double depositAmount;

    public DepositThreads(BankAccount account, double depositAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
    }

    public void run() {
        account.deposit(depositAmount);
    }
}

class WithdrawThreads implements Runnable {
    private BankAccount account;
    private double withdrawAmount;

    public WithdrawThreads(BankAccount account, double withdrawAmount) {
        this.account = account;
        this.withdrawAmount = withdrawAmount;
    }

    public void run() {
        account.withdraw(withdrawAmount);
    }
}

public class BankAccountExampleUsingAnonymous {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);


        WithdrawThread withdrawThread1 = new WithdrawThread(account,10000);
        DepositThread depositThread1 = new DepositThread(account,5000);
        DepositThread depositThread2 = new DepositThread(account,4000);
        WithdrawThread withdrawThread2 = new WithdrawThread(account,2000);

        Thread thread1 = new Thread(withdrawThread1);
        Thread thread2 = new Thread(depositThread1);
        Thread thread3 = new Thread(depositThread2);
        Thread thread4 = new Thread(withdrawThread2);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final Account Balance : " + account.getBalance());

    }

}
