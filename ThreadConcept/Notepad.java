package ThreadConcept;

public class Notepad implements Runnable {
    Counter _counter;

    public Notepad(Counter counter) {
        this._counter = counter;
    }

    public void run() {

        for (int i = 0; i < 10000; i++) {
            _counter.increment();
        }
    }

}
