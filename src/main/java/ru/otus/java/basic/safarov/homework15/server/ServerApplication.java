package ru.otus.java.basic.safarov.homework15.server;

public class ServerApplication {
    public static void main(String[] args) {
        int PORT = 8888;
        new Server(PORT).start();
    }
}