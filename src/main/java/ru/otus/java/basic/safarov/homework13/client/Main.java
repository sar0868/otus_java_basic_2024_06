package ru.otus.java.basic.safarov.homework13.client;

import java.net.Socket;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8888);
            PingClient client = new PingClient(socket)) {
            System.out.println(client.read());
            String input = scanner.nextLine();
            client.send(input);
            System.out.println(client.read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
