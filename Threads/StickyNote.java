package Threads;

public class StickyNote implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Dispaly()");
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
