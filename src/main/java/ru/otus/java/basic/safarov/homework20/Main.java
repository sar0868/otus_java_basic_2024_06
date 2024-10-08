package ru.otus.java.basic.safarov.homework20;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String folder = "src/main/resources/";
        Scanner scanner = new Scanner(System.in);
        File file;
        while (true) {
            System.out.println("Список файлов.");
            for (String el : Objects.requireNonNull(new File(folder).list())) {
                System.out.println(el);
            }
            System.out.print("Введите имя файла: ");
            String path = scanner.nextLine();
            file = new File(folder, path);
            if (file.isFile()) {
                break;
            }
            System.out.printf("Файла %s нет", path);
        }
        System.out.print("Введите последовательность: ");
        String pattern = scanner.nextLine();
        byte[] seq = pattern.getBytes(StandardCharsets.UTF_8);
        int patternLength = pattern.length();
        int count = 0;
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            int data;
            int i = 0;
            while ((data = bufferedReader.read()) != -1) {
                if (data == seq[i]) {
                    if (i == patternLength - 1) {
                        count++;
                        i = 0;
                    } else {
                        i++;
                    }
                } else {
                    i = 0;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Последовательность %s встретилась %d раз.", pattern, count);
    }
}
