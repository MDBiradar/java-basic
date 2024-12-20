package ThreadConcept;

public class Counter {
    public int counter;

    public synchronized void increment() {
        this.counter++;
    }

    public void ShowCount() {
        System.out.println("Result :" + this.counter);
    }

}
