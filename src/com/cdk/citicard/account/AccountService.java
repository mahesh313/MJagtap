package com.cdk.citicard.account;

/**
 * Created by jagtapm on 7/14/2017.
 */
//details associated with an account and methods to perform some basic operations
public class AccountService {
    public long accountNo;
    public double balance;
    public String type;
    public AccountService() {}
    public AccountService(long accountNo, double balance, String type) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.type = type;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }




    public void debit(double amount) {
        if ((this.balance - amount) < 0) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }
    public void credit(double amount) {
        balance += amount;
    }

    //some relation between accounts and bank and/or branch

}
