package comp.cdk.bank.interfaces;

/**
 * Created by jagtapm on 7/16/2017.
 */
public interface AccountService<T> {
    void open(long accountNo, double balance, String type);
    void close(T t);
    void withdraw(double amount);
    void deposit(double amount);
    double balance();
}
