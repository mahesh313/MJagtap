package com.cdk.citicard.client;

import com.cdk.citicard.account.AccountService;
import com.cdk.citicard.bank.BankService;
import com.cdk.citicard.branch.BranchService;
import com.cdk.citicard.customer.CustomerService;

/**
 * Created by jagtapm on 7/14/2017.
 */
public class ClientService {
    public static void main(String[] args) {
        BankService bankService = new BankService("Citi", 7000, 500, 500000, 568765876578.56, 454656565, 565655656 );
        BranchService branchService = new BranchService("Byculla", "ram", "TR15352");
        AccountService accountService = new AccountService(763547635, 8476856565.55, "savings");
        CustomerService customerService = new CustomerService("Mahesh", "757657456746587", "476567454", 21, "Byculla, mumbai", 973847837, accountService);
        bankService.getDetails();
        System.out.println("===========");
        branchService.getDetails();
        System.out.println("============");
        customerService.editDetails();
        customerService.getDetails();
        System.out.println("============");



    }
}
