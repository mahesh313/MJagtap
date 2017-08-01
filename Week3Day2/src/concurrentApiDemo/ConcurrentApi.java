package concurrentApiDemo;

import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by jagtapm on 8/1/2017.
 */
public class ConcurrentApi {
    BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
    int i = 0;

    @Test
    public void testConcurrentApi() {

        Thread numberGenerator = new Thread(() ->
        {   try {
            while(true) {
                i = (int) (Math.random() * 10000);
                blockingQueue.put(i);
            }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        );



        Thread numberPrinter = new Thread(() ->
        {
            try {
                while(true) {
                    System.out.println("i: " + blockingQueue.take());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        numberGenerator.start();
        numberPrinter.start();


    }

}
