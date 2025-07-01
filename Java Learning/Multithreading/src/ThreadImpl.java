public class ThreadImpl extends Thread {

    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread name: " + Thread.currentThread().getName());
        }
    }
}

class ThreadSecond extends Thread{
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println("Thread name: " + Thread.currentThread().getName());
        }
    }
}
