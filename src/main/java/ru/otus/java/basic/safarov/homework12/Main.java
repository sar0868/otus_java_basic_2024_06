package ru.otus.java.basic.safarov.homework12;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File path = new File("src/main/resources");
        for (String el : path.list()) {
            System.out.println(el);
        }
//        System.out.println(path + "/file1.txt");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Укажите имя файла: ");
            String file_name = scanner.nextLine();
            file_name = path + "/" + file_name;
            try {
                FileInputStream fin = new FileInputStream(file_name);
                BufferedInputStream inputData = new BufferedInputStream(fin);
                int c;
                while ((c=inputData.read())!=-1){
                    System.out.print((char) c);
                }
                fin.close();

//                BufferedOutputStream

                break;
            } catch (FileNotFoundException e) {
                System.out.println("Don't find " + file_name);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
