package threadDemoAssignment2;

/**
 * Created by jagtapm on 7/31/2017.
 */
public class ThreadFileA extends Thread{
    ThreadFileA threadFileA = null;
    public ThreadFileA(TaskReadFileA taskReadFileA) {
        threadFileA = new ThreadFileA(taskReadFileA);
    }
}
