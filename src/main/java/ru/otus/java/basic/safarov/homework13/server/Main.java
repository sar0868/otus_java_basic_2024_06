package ru.otus.java.basic.safarov.homework13.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    private static final String msgError = "Неверный запрос.";

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true){
            Socket clientSocket = serverSocket.accept();
//            System.out.println("Client connect");
            readRequest(clientSocket);
        }
    }

    private static void readRequest(Socket socket) throws IOException {
        DataInputStream input = new DataInputStream(
                new BufferedInputStream(socket.getInputStream()));
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(socket.getOutputStream()));
        String data = input.readUTF();
        data = data.replaceAll("\\s+", " ");
        String[] dataArray = data.trim().split(" ");
        if (dataArray.length != 3){
            out.writeUTF(msgError);
            out.flush();
        } else {
            try {
                String result = dataArray[0] + " " + dataArray[2] + " "
                        + dataArray[1] + " = " + calculate(dataArray);
                out.writeUTF(result);
                out.flush();
            } catch (ArithmeticException | IllegalArgumentException e){
                out.writeUTF(e.getMessage());
            } finally {
                out.flush();
            }
        }
    }

    private static int calculate(String[] dataArray){
        try{
            int a = Integer.parseInt(dataArray[0]);
            int b = Integer.parseInt(dataArray[1]);
            String operation = dataArray[2];
            switch (operation){
                case "+": return a + b;
                case "-": return a - b;
                case "*": return a * b;
                case "/": {
                    if (b == 0){
                        throw new ArithmeticException("divide by zero");
                    }
                    return a / b;
                }
                default:
                    throw new IllegalArgumentException("Incorrect input data");
            }
        } catch (NumberFormatException e){
            throw new NumberFormatException("Input data don't number");
        }
    }
}
