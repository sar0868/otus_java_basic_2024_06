package ru.otus.java.basic.safarov.homework04;

public class Box {

    private final int width;
    private final int lenght;
    private final int heigth;
    private String color;
    private boolean isOpen;
    private String inside;

    public Box(int width, int lenght, int heigth, String color) {
        this.width = width;
        this.lenght = lenght;
        this.heigth = heigth;
        this.color = color;
        isOpen = false;
        inside = "";
        System.out.println("Создана коробка.\n" + this);
    }

    @Override
    public String toString() {
        return "Коробка: \n" +
                "\tразмеры ширина: " + width +
                ", длина: " + lenght +
                ", высота: " + heigth +
                "\n\tцвет: " + color +
                "\n\tкоробка " + (isOpen ? "открыта" : "закрыта") +
                "\n\t" + (inside.isEmpty() ? "в коробке ничего нет" : "в коробке лежит " + inside);
    }

    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getInside() {
        return inside;
    }

    public void open() {
        if (isOpen) {
            System.out.println("Коробка уже открыта.");
            return;
        }
        isOpen = true;
        System.out.println("Коробка открыта.");
    }

    public void close() {
        if (!isOpen) {
            System.out.println("Коробка уже закрыта.");
            return;
        }
        isOpen = false;
        System.out.println("Коробка закрыта.");
    }

    public void paint(String color) {
        this.color = color;
    }

    public void put(String item) {
        if (isOpen) {
            if (inside.isEmpty()) {
                inside = item;
                System.out.println(item + " положили в коробку");
            } else {
                System.out.println("В коробке находится " + inside);
            }
        } else {
            System.out.println("Коробка закрыта");
        }

    }

    public String take() {
        if (isOpen) {
            if (!inside.isEmpty()) {
                System.out.println(inside + " выброшен из коробки");
                String getItem = inside;
                inside = "";
                return getItem;
            } else {
                System.out.println("Коробка пустая");
                return "";
            }
        }
        System.out.println("Коробка закрыта");
        return "";
    }
}
