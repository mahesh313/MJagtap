package threadDemoAssignment3;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by jagtapm on 7/31/2017.
 */
public class ExecutorServiceTest {
    @Test
    public void executorServiceTest() {
        ExecutorService task = new ExecutorService();
        Executor executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            executor.execute(task);
        }


    }

}
