package com.cdk.citicard.branch;

import com.cdk.citicard.bank.BankService;

/**
 * Created by jagtapm on 7/14/2017.
 */
// inherits properties of bank and has some fields associated with branch
public class BranchService extends BankService {
    protected String address;
    protected String manager;
    protected String ifsc;

    public BranchService() {
    }

    public BranchService(String bankName, long noEmployees, long branches, long accounts, double revenue, double loans, double deposits, String address, String manager, String ifsc) {
        super(bankName, noEmployees, branches, accounts, revenue, loans, deposits);
        this.address = address;
        this.manager = manager;
        this.ifsc = ifsc;
    }

    public BranchService(String address, String manager, String ifsc) {
        this.address = address;
        this.manager = manager;
        this.ifsc = ifsc;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getIfsc() {
        return ifsc;
    }


    public void getDetails(){
        super.getDetails();
        System.out.println("branch address : " + address);
        System.out.println("IFSC code : " + ifsc);
        System.out.println("manager : " + manager);
    }

}
