package ru.otus.java.basic.safarov.homework19;


public class Main {

    public static void main(String[] args) {
        int[] w = {1, 2, 3, 4};
        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < 4; i++) {
            appleBox.add(new Apple(w[i]));
        }
        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 3; i++) {
            orangeBox.add(new Orange(w[i]));
        }
        Box<Fruit> fruitBox = new Box<>();
        for (int i = 0; i < 2; i++) {
            fruitBox.add(new Apple(w[i]));
        }
        for (int i = 2; i < 4; i++) {
            fruitBox.add(new Orange(w[i]));
        }
        Box<Fruit> fruitBox1 = new Box<>();

        System.out.println(appleBox.compare(orangeBox));
        System.out.println(appleBox.compare(fruitBox));

        fruitBox.shiftElements(fruitBox1);
        fruitBox1.getBox().forEach(System.out::println);

        appleBox.shiftElements(fruitBox1);
        orangeBox.shiftElements(fruitBox1);
        fruitBox1.getBox().forEach(System.out::println);

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox.shiftElements(orangeBox1);
    }
}
