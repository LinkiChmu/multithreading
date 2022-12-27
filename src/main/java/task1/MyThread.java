package task1;

/**
 * Thread - class every few seconds print a message to the console
 **/
public class MyThread extends Thread {

    public MyThread(ThreadGroup tg, String name) {
        super(tg, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("I'm a thread %s. Hello, everybody!\n", getName());
            }
        } catch (InterruptedException e) {
            //         System.out.printf("Thread %s sleep interrupted\n", getName());
            return;
        } finally {
            System.out.printf("Thread %s finished\n", getName());
        }
    }
}
