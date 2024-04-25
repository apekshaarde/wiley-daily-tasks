package com.lock.ex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyBankAccount {
    private double balance;

    Lock lock1 = new ReentrantLock();
    Lock lock2 = new ReentrantLock();

    public MyBankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        System.out.println("Depositing " + amount + "₹");

        lock1.lock();
        lock2.lock();

        double newBalance = balance + amount;

        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }

        balance = newBalance;

        lock1.unlock();
        lock2.unlock();

        System.out.println("Balance after depositing : " + balance + "₹");
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + "₹");

        lock2.lock();
        lock1.lock();

        if (amount > balance) {
            System.out.println("Insufficient Balance. Please deposit first");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        double newBalance = balance - amount;

        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }

        balance = newBalance;

        lock1.unlock();
        lock2.unlock();

        System.out.println("Balance after withdrawing : " + balance + "₹");
    }
}

class MyDepositThread extends Thread {
    private MyBankAccount account;
    private double depositAmount;

    public MyDepositThread(MyBankAccount account, double depositAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
    }

    public void run() {
        account.deposit(depositAmount);
    }
}

class MyWithdrawThread extends Thread {
    private MyBankAccount account;
    private double withdrawAmount;

    public MyWithdrawThread(MyBankAccount account, double withdrawAmount) {
        this.account = account;
        this.withdrawAmount = withdrawAmount;
    }

    public void run() {
        account.withdraw(withdrawAmount);
    }
}

public class ThreadSynchronizationWithLock {

    public static void main(String[] args) {
        MyBankAccount account = new MyBankAccount(0);

        MyDepositThread thread1 = new MyDepositThread(account, 5000);
        MyWithdrawThread thread2 = new MyWithdrawThread(account, 2000);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final Account Balance : " + account.getBalance());
    }
}
