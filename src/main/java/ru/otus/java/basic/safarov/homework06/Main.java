package ru.otus.java.basic.safarov.homework06;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        String[] names = {"Barsik", "Murzik", "Fox"};
        int[] appetites = {10, 5, 20};
        Plate plate = new Plate(34);
        for (int i = 0; i < 3; i++) {
            cats[i] = new Cat(names[i], appetites[i]);
        }
        for (Cat cat : cats) {
            cat.eat(plate.getCurrentFood());
            plate.decrease(cat.getAppetite());
            System.out.println(cat);
        }
    }
}
