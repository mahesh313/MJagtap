package comp.cdk.bank.bank;

import comp.cdk.bank.account.AccountServiceImpl;
import comp.cdk.bank.customer.CustomerServiceImpl;

/**
 * Created by jagtapm on 7/16/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AccountServiceImpl account = new AccountServiceImpl();
        account.open(785746434, 94785454.903, "Savings");
        CustomerServiceImpl customerService = new CustomerServiceImpl("Mahesh", "757657456746587", "476567454", 21, "Byculla, mumbai", 973847837, account);
        System.out.println("================");
        System.out.println(account.balance());
        System.out.println("================");
        account.deposit(700);
        System.out.println("================");
        account.withdraw(700);
        System.out.println("================");
        customerService.display();
        System.out.println("================");
        customerService.updateAddress("updated address");
        System.out.println("================");
        customerService.updateMobile(74657454);
        System.out.println("================");
        customerService.display();
        System.out.println("================");
        account.close(account);
        System.gc();
        System.out.println("================");
        customerService.display();
        System.gc();
        System.runFinalization();
        Thread.sleep(10000);
        System.gc();
        System.out.println(account.balance());
    }


}
