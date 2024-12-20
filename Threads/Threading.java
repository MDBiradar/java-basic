package Threads;

public class Threading {

    public void ThredingStart() {

        Runnable notepad = new Notepad();
        Runnable sn = new StickyNote();
        Thread t1 = new Thread(notepad);
        Thread t2 = new Thread(sn);
        t1.start();
        t2.start();
    }
}
