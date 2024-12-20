package ThreadConcept;

public class StickyNote implements Runnable {
    Counter _counter;

    public StickyNote(Counter counter) {
        this._counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            _counter.increment();
        }
    }
}
