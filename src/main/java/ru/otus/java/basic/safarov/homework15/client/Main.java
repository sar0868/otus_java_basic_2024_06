package ru.otus.java.basic.safarov.homework15.client;

import java.net.Socket;
import java.util.Scanner;

public class Main {
    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            try (Socket socket = new Socket("127.0.0.1", 8888);
                 PingClient client = new PingClient(socket)){
                System.out.println(client.read());
                String msg = scanner.nextLine();
                client.seng(msg);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
