package ru.otus.java.basic.safarov.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        File path = new File("src/main/resources");
        System.out.println("Содержимое каталога " + path.getName());
        for (String el : Objects.requireNonNull(path.list())) {
            System.out.println(el);
        }
        while (true) {
            System.out.print("Укажите имя файла: ");
            String fileName = scanner.nextLine();
            File file = new File(path + "/" + fileName);
            if (file.isFile()) {
                read(file);
                write(file);
                read(file);
                break;
            } else {
                System.out.println("Don't find " + fileName);
            }
        }
    }

    private static void read(File file) {
        try (InputStreamReader fin = new InputStreamReader(
                new BufferedInputStream(
                        new FileInputStream(file)))) {
            int n = fin.read();
            while (n != -1) {
                System.out.print((char) n);
                n = fin.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void write(File file) {
        String text = scanner.nextLine();
        try (BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream(file, true))) {
            byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
