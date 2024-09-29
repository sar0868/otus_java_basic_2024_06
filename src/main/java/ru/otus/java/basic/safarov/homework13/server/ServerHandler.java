package ru.otus.java.basic.safarov.homework13.server;

import java.io.*;
import java.net.Socket;

public class ServerHandler {
    private final DataInputStream input ;
    private final DataOutputStream out ;

    public ServerHandler(Socket socket) throws IOException {
        this.input = new DataInputStream(
                new BufferedInputStream(socket.getInputStream()));
        this.out = new DataOutputStream(
                new BufferedOutputStream(socket.getOutputStream()));
    }

    private String[] read() throws IOException {
        String data = input.readUTF();
        data = data.replaceAll("\\s+", " ");
        return data.trim().split(" ");
    }

    public void info() throws IOException {
        String infoText = "Доступные операции калькулятора:"
                + "\n+ сложение"
                + "\n- вычитание"
                + "\n* умножение "
                + "\n/ деление";
        out.writeUTF(infoText);
        out.flush();
    }

    public void readRequest() throws IOException {
        String[] dataArray = read();
        if (dataArray.length != 3){
            String MSG_ERROR = "Неверный запрос.";
            out.writeUTF(MSG_ERROR);
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

    private static String calculate(String[] dataArray){
        try{
            int a = Integer.parseInt(dataArray[0]);
            int b = Integer.parseInt(dataArray[1]);
            String operation = dataArray[2];
            switch (operation){
                case "+": return String.valueOf(a + b);
                case "-": return String.valueOf(a - b);
                case "*": return String.valueOf(a * b);
                case "/": {
                    if (b == 0){
                        throw new ArithmeticException("divide by zero");
                    }
                    return String.valueOf((float) a / b);
                }
                default:
                    throw new IllegalArgumentException("Incorrect input data");
            }
        } catch (NumberFormatException e){
            throw new NumberFormatException("Input data don't number");
        }
    }
}
