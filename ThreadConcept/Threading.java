package ThreadConcept;

public class Threading {

    public void thredingStart() {
        try {
            Counter c = new Counter();
            Runnable notepad = new Notepad(c);
            Runnable sn = new StickyNote(c);
            Thread t1 = new Thread(notepad);
            Thread t2 = new Thread(sn);
            t1.start();
            t2.start();

            // Added sleep
            Thread.sleep(1000);
            System.out.println("Counter: " + c.counter);
            c.showCount();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
