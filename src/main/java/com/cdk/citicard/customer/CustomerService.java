package com.cdk.citicard.customer;

import com.cdk.citicard.account.AccountService;

/**
 * Created by jagtapm on 7/14/2017.
 */
// customer has an account and some fields associated to it
public class CustomerService {
    String name;
    String aadhar;
    String pan;
    int age;
    String address;
    long contact;
    AccountService accountService;


    public CustomerService(String name, String aadhar, String pan, int age, String address, long contact, AccountService accountService) {
        this.name = name;
        this.aadhar = aadhar;
        this.pan = pan;
        this.age = age;
        this.address = address;
        this.contact = contact;
        this.accountService = accountService;
    }

    public void editDetails() {
        System.out.println("details has been edited ");
    }

    public void getDetails(){
        System.out.println("name : " + name);
        System.out.println("aadhar : " + aadhar);
        System.out.println("pan : " + pan);
        System.out.println("age : " + age);
        System.out.println("address : " + address);
        System.out.println("contact : " + contact);
        System.out.println("account no : " + accountService.accountNo);
        System.out.println("balance : " + accountService.balance);
        System.out.println("type : " + accountService.type);
    }

    // methods to access some methods in the accountService class
}
