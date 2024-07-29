package ru.otus.java.safarov.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static char[][] map;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '_';
    static int SIZE = 3;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        init();
        printMap();
        while (true) {
            playerMove();
            printMap();
            if (checkResult(DOT_X)) {
                return;
            }
            compMove();
            printMap();
            if (checkResult(DOT_O)) {
                return;
            }
        }
    }

    private static boolean checkWin(char c) {
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][0] == c && map[i][1] == c && map[i][2] == c) {
                return true;
            }
            if (map[0][i] == c && map[1][i] == c && map[2][i] == c) {
                return true;
            }
            if (map[i][i] == c) {
                diagonal1++;
            }
            if (map[SIZE - 1 - i][i] == c) {
                diagonal2++;
            }
        }
        return diagonal1 == 3 || diagonal2 == 3;
    }

    private static boolean draw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkResult(char c) {
        if (checkWin(c)) {
            if (c == DOT_X) {
                System.out.println("Win!");
                return true;
            } else if (c == DOT_O) {
                System.out.println("Lost!");
                return true;
            }
        } else if (!draw()) {
            System.out.println("Draw!");
            return true;
        }
        return false;
    }

    private static void compMove() {
        //поиск победы
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isEmpty(i, j)) {
                    map[i][j] = DOT_O;
                    if (checkWin(DOT_O)) {
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        //не проиграть
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isEmpty(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X)) {
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }


        while (true) {
            int x = random.nextInt(SIZE);
            int y = random.nextInt(SIZE);
            if (isEmpty(x, y)) {
                map[x][y] = DOT_O;
                return;
            }
        }
    }

    private static void playerMove() {
        int x;
        int y;
        do {
            System.out.println("Сделайте Ваш ход.");
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x > 0 && x < 4 && y > 0 && y < 4) {
                if (isEmpty(x - 1, y - 1)) {
                    map[x - 1][y - 1] = DOT_X;
                    return;
                }
            }
        } while (true);
    }

    private static boolean isEmpty(int x, int y) {
        return map[x][y] == DOT_EMPTY;
    }

    private static void printMap() {
        System.out.print("   ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%2d ", i + 1);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void init() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
}
