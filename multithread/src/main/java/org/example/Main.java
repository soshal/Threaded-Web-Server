package org.example;

public class Main implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);  // Simulate work
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        // Create the Runnable task
        Main task = new Main();

        // Create a Thread and pass the Runnable task to it
        Thread thread = new Thread(task);

        // Start the thread
        thread.start();

        // Main thread also does something
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);  // Simulate work
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}
