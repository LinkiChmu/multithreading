package task1;

/**
 * 1. Create a ThreadGroup to manage threads as one;
 * 2. Create 4 instances of MyThread with constructor parameter the ThreadGroup and start them;
 * 3. Put main thread to sleep for 15 seconds;
 * 4. Terminate all created threads by calling one method.
 **/

public class MainGroup {
    public static void main(String[] args) {
        System.out.println("Creating thread group...");
        ThreadGroup thGroup = new ThreadGroup("ThreadGroup");

        try {
            for (int i = 1; i < 5; i++) {
                var thread = new MyThread(thGroup, String.valueOf(i));
                thread.start();
            }
            Thread.sleep(15_000);
            System.out.println("Finishing all the threads...");
            thGroup.interrupt();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
