package CallableDemoAssignment;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by jagtapm on 8/1/2017.
 */

/**
 * class CallableDemo is used to compute and display sum of prime numbers
 * between 1 to 500. Callable interface and ExecutorService are used.
 */
public class CallableDemo {

    /**
     * Function computePrime() computes sum of prime numbers between 1 to 500
     * using 5 tasks and executes them by creating thread pool using factory
     * method in Executors and prints the result.
     */

    public void computePrime() {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Future<Integer> sum1 = executorService.submit(() -> {
            int sum = 2;
            for (int i = 3; i <= 100; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
            return sum;
        });


        Future<Integer> sum2 = executorService.submit(() -> {
            int sum = 0;
            for (int i = 101; i <= 200; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
            return sum;
        });

        Future<Integer> sum3 = executorService.submit(() -> {
            int sum = 0;
            for (int i = 201; i <= 300; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
            return sum;
        });

        Future<Integer> sum4 = executorService.submit(() -> {
            int sum = 0;
            for (int i = 301; i <= 400; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
            return sum;
        });

        Future<Integer> sum5 = executorService.submit(() -> {
            int sum = 0;
            for (int i = 401; i <= 500; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
            return sum;
        });


        try {
            int total = sum1.get() + sum2.get() + sum3.get() + sum4.get() + sum5.get();
            System.out.printf("Total sum of primes between 1 to 500 is %d%n", total);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    /**
     * Function isPrime() checks whether int i is prime or not
     * and then returns result accordingly.
     *
     * @param i number to check
     * @return boolean result true if number is prime else false
     */

    private boolean isPrime(int i) {
        int factors = 0;
        int j = 1;

        while (j <= i) {
            if (i % j == 0) {
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }


}
