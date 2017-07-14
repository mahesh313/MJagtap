package com.cdk.citicard.bank;

/**
 * Created by jagtapm on 7/14/2017.
 */
// displays basic fields associated with a bank and getDetails() method
public class BankService {
    protected String bankName;
    protected long noEmployees;
    protected long branches;
    protected long accounts;
    protected double revenue;
    protected double loans;
    protected double deposits;

    public BankService(){}


    public BankService(String bankName, long noEmployees, long branches, long accounts, double revenue, double loans, double deposits) {
        this.bankName = bankName;
        this.noEmployees = noEmployees;
        this.branches = branches;
        this.accounts = accounts;
        this.revenue = revenue;
        this.loans = loans;
        this.deposits = deposits;
    }


    public String getBankName() {
        return bankName;
    }


    public long getNoEmployees() {
        return noEmployees;
    }

    public void setNoEmployees(long noEmployees) {
        this.noEmployees = noEmployees;
    }

    public long getBranches() {
        return branches;
    }

    public void setBranches(long branches) {
        this.branches = branches;
    }

    public long getAccounts() {
        return accounts;
    }

    public void setAccounts(long accounts) {
        this.accounts = accounts;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getLoans() {
        return loans;
    }

    public void setLoans(double loans) {
        this.loans = loans;
    }

    public double getDeposits() {
        return deposits;
    }

    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }

    public void getDetails(){
        System.out.println("Bank Name is : " + bankName);
        System.out.println("No of employees : " + noEmployees);
        System.out.println("Branches : " + branches);
        System.out.println("Revenue" + revenue);
        System.out.println("accounts" + accounts);
        System.out.println("loans" + loans);
        System.out.println("deposits" + deposits);
    }

}
