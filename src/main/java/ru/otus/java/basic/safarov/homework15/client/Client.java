package ru.otus.java.basic.safarov.homework15.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private final Socket socket;
    private final DataInputStream in;
    private final DataOutputStream out;
    private final Scanner scanner;

    public Client(String ip, int port) throws IOException {
        this.scanner = new Scanner(System.in);
        this.socket = new Socket(ip, port);
        this.in = new DataInputStream(socket.getInputStream());
        this.out = new DataOutputStream(socket.getOutputStream());
    }

    public void start() throws IOException {
        new Thread(() -> {
            try {
                while (true){
                    String msg = in.readUTF();
                    if (msg.startsWith("/")){
                        if (msg.startsWith("/exitok")){
                            break;
                        }
                    }
                    System.out.println(msg);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            finally {
                disconnect();
            }
        }).start();
        while (true){
            String msg = scanner.nextLine();
            out.writeUTF(msg);
            if (msg.startsWith("/exit")){
                break;
            }
        }
    }

    private void disconnect() {
        try {
            in.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
