package threadDemoAssignment2;

/**
 * Created by jagtapm on 7/31/2017.
 */
public class ThreadFileB extends Thread{
    ThreadFileB threadFileB = null;

    public ThreadFileB(TaskReadFileB taskReadFileB) {
        threadFileB = new ThreadFileB(taskReadFileB);
    }
}
