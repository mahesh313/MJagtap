package threadDemoAssignment2;

import org.junit.Test;

/**
 * Created by jagtapm on 7/31/2017.
 */
public class ThreadFileDemo {
    @Test
    public void testThreadFileDemo() {
        Thread threadFileA = new Thread(new TaskReadFileA());
        threadFileA.start();

        Thread threadFileB = new Thread(new TaskReadFileB());
        threadFileB.start();

    }



}


