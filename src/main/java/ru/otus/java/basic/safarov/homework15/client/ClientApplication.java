package ru.otus.java.basic.safarov.homework15.client;

import java.io.IOException;

public class ClientApplication {
    private final static String IP = "localhost";
    private final static int PORT = 8888;
    public static void main(String[] args) throws IOException {
        new Client(IP, PORT).start();
    }
}