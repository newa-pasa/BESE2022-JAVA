
Concurrency vs Parallel

Concurrency in Java refers to the ability of a program to execute multiple tasks simultaneously. It is a crucial aspect of modern software development, enabling developers to create efficient and responsive applications. Java provides built-in support for concurrency through its multithreading features. Here are key concepts related to concurrency in Java:

### 1. **Thread:**
   - A thread is the smallest unit of execution in a program.
   - Java allows you to create and manage threads using the `Thread` class or by implementing the `Runnable` interface.

### 2. **Multithreading:**
   - Multithreading is the concurrent execution of two or more threads.
   - It allows different threads to run concurrently within the same program.

### 3. **Synchronization:**
   - Synchronization is a technique used to control access to shared resources to avoid data inconsistencies.
   - Java provides synchronized methods and blocks to achieve synchronization.

### 4. **Thread Safety:**
   - Ensuring that data accessed by multiple threads is handled in a way that avoids data corruption is known as achieving thread safety.
   - Techniques include synchronization, using atomic classes, and using concurrent data structures.

### 5. **Atomic Operations:**
   - Atomic operations are operations that run entirely or not at all.
   - Java provides atomic classes in the `java.util.concurrent.atomic` package, such as `AtomicInteger`, to perform atomic operations.

### 6. **Thread Pool:**
   - A thread pool is a group of pre-initialized reusable threads.
   - It helps manage and control the number of threads in an application, reducing the overhead of thread creation.

### 7. **Executor Framework:**
   - The `Executor` framework provides a higher-level replacement for managing threads.
   - It decouples task submission from the mechanics of how each task will be run.

### 8. **Locks:**
   - The `java.util.concurrent.locks` package provides a framework for explicit locking and unlocking.
   - ReentrantLock and ReadWriteLock are examples of locks.

### 9. **Fork-Join Framework:**
   - The Fork-Join framework in Java is used for parallel programming.
   - It is particularly useful for recursive algorithms and divide-and-conquer problems.

### 10. **BlockingQueue:**
   - The `BlockingQueue` interface in the `java.util.concurrent` package is used for implementing producer-consumer patterns.
   - It provides a thread-safe way for tasks to communicate.

### 11. **CountDownLatch and CyclicBarrier:**
   - These are synchronization aids provided by the `java.util.concurrent` package.
   - `CountDownLatch` allows one or more threads to wait until a set of operations is completed.
   - `CyclicBarrier` allows a set of threads to wait for each other to reach a common barrier point.

### 12. **ThreadLocal:**
   - The `ThreadLocal` class provides thread-local variables, allowing each thread to have its own copy of a variable.

### 13. **CompletableFuture:**
   - The `CompletableFuture` class, introduced in Java 8, is used for composing asynchronous and concurrent computations.

### 14. **Volatile Keyword:**
   - The `volatile` keyword is used to declare a variable whose value may be changed by multiple threads.

## Example by extending Thread

```java 
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
                Thread.sleep(100);
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
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

```

## Example by implementing Runnable

```java 
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

```