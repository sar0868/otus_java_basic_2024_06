package ru.otus.java.basic.safarov.homework13.client;

import java.io.*;
import java.net.Socket;

public class PingClient implements AutoCloseable{
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public PingClient(Socket socket) throws IOException {
        this.inputStream = new DataInputStream(
                new BufferedInputStream(socket.getInputStream()));
        this.outputStream = new DataOutputStream(
                new BufferedOutputStream(socket.getOutputStream()));
    }

    public void send(String text) throws IOException {
        outputStream.writeUTF(text);
        outputStream.flush();
    }

    public String read() throws IOException {
        return inputStream.readUTF();
    }

    @Override
    public void close() throws Exception {
        inputStream.close();
        outputStream.close();
    }
}
