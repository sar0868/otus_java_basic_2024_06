package ru.otus.java.basic.safarov.homework15.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Main {
    private static final int PORT = 8888;

    public static void main(String[] args){
        while (true){
            try (ServerSocketChannel serverSocketChannel = ServerSocketChannel.open())
            {
                serverSocketChannel.socket().bind(new InetSocketAddress(PORT));
                SocketChannel clientChannel = serverSocketChannel.accept();
                System.out.println("Client connected " + clientChannel.getRemoteAddress());
                String text = "test";
                ByteBuffer bufferWrite = ByteBuffer.wrap(text.getBytes());
                clientChannel.write(bufferWrite);
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                int bytesRead = clientChannel.read(buffer);
                String msg = new String(buffer.array(), 0, bytesRead);
                System.out.println("Received message from client: " + msg);
                clientChannel.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
