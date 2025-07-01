import definethread.ExtendThreadClass;
import definethread.ImplementRunnable;

public class ThreadDemo {
    public static void main(String[] args) {
//        ExtendThreadClass threadExecution = new ExtendThreadClass(); // ---> thread initialed.
//        threadExecution.start();
    //    threadExecution.start();
     //   threadExecution.run(10);

        ImplementRunnable runnable = new ImplementRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread:");
        }

    }
}
