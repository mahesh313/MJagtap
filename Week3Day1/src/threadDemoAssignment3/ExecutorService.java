package threadDemoAssignment3;

/**
 * Created by jagtapm on 7/31/2017.
 */
public class ExecutorService implements Runnable {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <=500; i++) {
            sum +=i;
        }
        System.out.printf("Sum %d%n", sum);
    }
}
