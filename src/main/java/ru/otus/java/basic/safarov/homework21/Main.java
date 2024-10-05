package ru.otus.java.basic.safarov.homework21;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private final Object monitor = new Object();
    private String letter;

    public static void main(String[] args) {
        Main main = new Main();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new Thread(() -> {
            main.getA();
        }));
        executorService.execute(new Thread(() -> {
            main.getB();
        }));
        executorService.execute(new Thread(() -> {
            main.getC();
        }));
        executorService.shutdown();
    }

    private void getA() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter != null && !letter.equals("C")) {
                        monitor.wait();
                    }
                    letter = "A";
                    System.out.print(letter);
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
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
                throw new RuntimeException(e);
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
                throw new RuntimeException(e);
            }
        }
    }
}
