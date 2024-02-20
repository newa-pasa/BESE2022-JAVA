class NumberPrinter extends Thread {
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
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        // Create two threads that print numbers from 1 to 5
        NumberPrinter thread1 = new NumberPrinter(1, 5);
        NumberPrinter thread2 = new NumberPrinter(6, 10);

        // Start the threads
        thread1.start();
        thread2.start();

        // Main thread continues its own execution
        for (int i = 11; i <= 15; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                // Simulate some processing time
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}