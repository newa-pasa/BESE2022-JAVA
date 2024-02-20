class NumberPrinter implements Runnable {
    private int start;
    private int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                // Simulate some processing time
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadExampleWithRunnable {
    public static void main(String[] args) {
        // Create instances of NumberPrinter with different ranges
        NumberPrinter printer1 = new NumberPrinter(1, 5);
        NumberPrinter printer2 = new NumberPrinter(6, 10);

        // Create threads with the NumberPrinter instances
        Thread thread1 = new Thread(printer1, "Thread 1");
        Thread thread2 = new Thread(printer2, "Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();

        // Main thread continues its own execution
        for (int i = 11; i <= 15; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                // Simulate some processing time
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}