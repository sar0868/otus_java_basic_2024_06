package ru.otus.java.basic.safarov.homework13.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connect");
            ServerHandler serverHandler = new ServerHandler(clientSocket);
            serverHandler.info();
            serverHandler.readRequest();
        }
    }
}
