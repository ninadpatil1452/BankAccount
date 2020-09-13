package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(int amount){
        System.out.println(amount+" has been deposited to your account.");
        balance+=amount;
        System.out.println("your current balcance is "+balance);
    }
    public void withdrawFunds(int amount){
        if (balance>=500) {
            System.out.println(amount + " has been withdrawn from your account.");
            balance -= amount;
            System.out.println("your current balcance is "+balance);
        }else {
            System.out.println("you have insufficient balance .");
            System.out.println("your balance is "+balance);
        }

    }
}