package comp.cdk.bank.customer;

import comp.cdk.bank.account.AccountServiceImpl;
import comp.cdk.bank.interfaces.CustomerService;

/**
 * Created by jagtapm on 7/16/2017.
 */
public class CustomerServiceImpl implements CustomerService{
    String name;
    String aadhar;
    String pan;
    int age;
    String address;
    long contact;
    AccountServiceImpl accountServiceImpl = new AccountServiceImpl();

    public String getName() {
        return name;
    }

    public String getAadhar() {
        return aadhar;
    }

    public String getPan() {
        return pan;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public long getContact() {
        return contact;
    }




    public CustomerServiceImpl(String name, String aadhar, String pan, int age, String address, long contact, AccountServiceImpl accountServiceImpl) {
        this.name = name;
        this.aadhar = aadhar;
        this.pan = pan;
        this.age = age;
        this.address = address;
        this.contact = contact;
        this.accountServiceImpl = accountServiceImpl;
    }

    @Override
    public void display() {
        System.out.println("name : " + name);
        System.out.println("aadhar : " + aadhar);
        System.out.println("pan : " + pan);
        System.out.println("age : " + age);
        System.out.println("address : " + address);
        System.out.println("contact : " + contact);
        System.out.println("account no : " + accountServiceImpl.accountNo);
        System.out.println("balance : " + accountServiceImpl.balance);
        System.out.println("type : " + accountServiceImpl.type);
    }

    @Override
    public void updateAddress(String address) {
        this.address = address;
        System.out.println("Address has been updated to " + this.address);
    }

    @Override
    public void updateMobile(long mobileNo) {
        this.contact = contact;
        System.out.println("Mobile has been updated to " + this.contact);

    }
}
