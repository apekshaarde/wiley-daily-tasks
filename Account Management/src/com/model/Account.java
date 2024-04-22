package com.model;

public class Account {

    private long accountNo;
    private String customerName;
    private double balance;

    private static int accountCount = 0;

    public Account(){
        accountCount++;
    }

    public static int getNumberOfAccounts() {
        return accountCount;
    }


    public long getAccountNo() {
        return accountNo;
    }

    public Account(long accountNo, String customerName, double balance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
        accountCount++;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println(+amount+ " amount added successfully.....");
        }else {
            System.out.println("please enter valid amount");
        }

    }

    public void withdraw(double amount){

        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println(amount+" withdraw from account successfully...");
        }else{
            System.out.println("insufficient balance...");
        }

    }

    public void showAccountInfo(){
        System.out.println("Account No: "+accountNo);
        System.out.println("Name : "+customerName);
        System.out.println("Account Balance : "+balance);
    }

}