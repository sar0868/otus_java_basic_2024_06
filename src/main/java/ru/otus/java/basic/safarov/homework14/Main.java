package ru.otus.java.basic.safarov.homework14;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        double[] array1 = new double[100_000_000];
        implementation1(array1);
        long endTime = System.currentTimeMillis();
        System.out.println("Implementation 1: " + (endTime - startTime));
        System.out.println("array1[20] = " + array1[20]);
        System.out.println("array1[90_000_000] = " + array1[90_000_000]);
        startTime = System.currentTimeMillis();
        double[] array2 = new double[100_000_000];
        implementation2(array2);
        endTime = System.currentTimeMillis();
        System.out.println("Implementation 2: " + (endTime - startTime));
        System.out.println("array2[20] = " + array2[20]);
        System.out.println("array2[90_000_000] = " + array2[90_000_000]);
    }

    public static void implementation1(double[] array) {
        fillArray(array, 0, array.length);
    }

    public static void implementation2(double[] array) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                fillArray(array, 0, 250_000);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                fillArray(array, 25_000_000, 50_000_000);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                fillArray(array, 50_000_000, 75_000_000);
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                fillArray(array, 75_000_000, 100_000_000);
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

    }

    private static void fillArray(double[] array, int start, int end) {
        for (int i = start; i < end; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(1 / 1.2);
        }
    }
}
