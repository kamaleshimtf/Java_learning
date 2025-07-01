package definethread;

public class ExtendThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread");
    }

    public void start()
    {
        super.start();
        System.out.println("Starting Child Thread");
    }

    public void run(int number) {
        System.out.println("Child Thread with argument " + number);
    }
}
