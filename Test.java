package test;
import mythread.MyThread;



public class Test {
    public static void main(String[] args)
    {

            MyThread thread = new MyThread();
            thread.setName("Mythread");
            thread.run();

            MyThread thread1 = new MyThread();
            thread1.setName("thison");
            thread1.start();

    }
}
