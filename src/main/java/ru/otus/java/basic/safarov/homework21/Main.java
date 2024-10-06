package ru.otus.java.basic.safarov.homework21;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    private final Object monitor = new Object();
    private String letter = "C";

    public static void main(String[] args) {
        Main main = new Main();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(() -> main.getA());
        executorService.execute(() -> main.getB());
        executorService.execute(() -> main.getC());
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(1, TimeUnit.MINUTES)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    private void getA() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!letter.equals("C")) {
                        monitor.wait();
                    }
                    letter = "A";
                    System.out.print(letter);
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void getB() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!letter.equals("A")) {
                        monitor.wait();
                    }
                    letter = "B";
                    System.out.print(letter);
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void getC() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!letter.equals("B")) {
                        monitor.wait();
                    }
                    letter = "C";
                    System.out.print(letter);
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
