package ru.otus.java.basic.safarov.homework20;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String folder = "src/main/resources/";
        Scanner scanner = new Scanner(System.in);
        File file;
        while (true){
            Arrays.asList(new File(folder).listFiles()).forEach((e) -> System.out.println(e));
//            System.out.println(Arrays.asList(new File(folder).listFiles()));
            System.out.print("Введите имя файла: ");
            String path = scanner.nextLine();
            file = new File(folder,path);
            if (file.isFile()){
                break;
            }
            System.out.printf("Файла %s нет",path);
            System.out.println("");
        }

//        System.out.print("Введите последовательность: ");
//        String pattern = scanner.nextLine();
//        String path = "file_hw20.txt";
        String pattern = "ad";
        byte[] seq = pattern.getBytes(StandardCharsets.UTF_8);
        int patternLength = pattern.length();
        char[] buffer = new char[patternLength];
        int count = 0;

        try(FileReader fileReader =
        new FileReader( file, StandardCharsets.UTF_8)){
            int data;
            int i = 0;
            while ((data = fileReader.read()) != -1){
//                if (data == '\n'){
//                    continue;
//                }
                if(data == seq[i] ){
                    if (i == patternLength-1){
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
        System.out.println("Последовательность " + pattern + " встретилась " + count + " раз.");
    }
}
