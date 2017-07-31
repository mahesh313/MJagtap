package threadDemoAssignment;

import org.junit.Test;

/**
 * Created by jagtapm on 7/31/2017.
 */
public class TestThread {

    int i = 0;
    @Test
    public void testThread() {
        int i = 0;
        Thread valueWorker = new Thread(new Runnable() {
            @Override
            public void run() {
                int j = 0;
                while (j < 20000) {
                    (TestThread.this.i)++;
                    j++;
                }
            }
        });
        valueWorker.start();
        Thread printWorker = new Thread(() -> {int j = 0; while(j < 20000) {System.out.println(this.i); j++;}});
        printWorker.start();

    }


}
