package ru.otus.java.basic.safarov.homework04;

public class Box {

    private final int width;
    private final int lenght;
    private final int heigth;
    private String color;
    private boolean isOpen;
    private String item;

    public Box(int width, int lenght, int heigth, String color) {
        this.width = width;
        this.lenght = lenght;
        this.heigth = heigth;
        this.color = color;
        isOpen = false;
        item = "";
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
                "\n\t" + (item.isEmpty() ? "в коробке ничего нет" : "в коробке лежит " + item);
    }

    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return lenght;
    }

    public int getHeigth() {
        return heigth;
    }

    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getItem() {
        return item;
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
            if (this.item.isEmpty()) {
                this.item = item;
                System.out.println(item + " положили в коробку");
            } else {
                System.out.println("В коробке находится " + this.item);
            }
        } else {
            System.out.println("Коробка закрыта");
        }

    }

    public String take() {
        if (isOpen) {
            if (!item.isEmpty()) {
                System.out.println(item + " выброшен из коробки");
                String getItem = item;
                item = "";
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
