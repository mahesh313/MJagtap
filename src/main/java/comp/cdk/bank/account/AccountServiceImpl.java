package comp.cdk.bank.account;

import comp.cdk.bank.interfaces.AccountService;

/**
 * Created by jagtapm on 7/16/2017.
 */
public class AccountServiceImpl <AccountServiceImpl> implements AccountService{
    public long accountNo;
    public double balance;
    public String type;

    public long getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }



    @Override
    public void open(long accountNo, double balance, String type) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.type = type;
        System.out.println("New account has opened ");

    }

    @Override
    public void close(Object o) {
        this.accountNo = 0;
        this.balance = 0.0;
        this.type = null;
        o = null;
        System.out.println("account has been closed");

    }


    @Override
    public void withdraw(double amount) {
        if ((this.balance - amount) < 0) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
        System.out.println("Updated balance is " + this.balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Updated balance is " + this.balance);

    }

    @Override
    public double balance() {
        return this.balance;
    }
}
