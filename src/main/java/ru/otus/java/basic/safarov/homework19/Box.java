package ru.otus.java.basic.safarov.homework19;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    private final List<T> box;

    public Box() {
        this.box = new ArrayList<>();
    }


    public List<T> getBox() {
        return box;
    }

    public void add(T element){
        box.add(element);
    }

    public int weight(){
        int result = 0;
        for (T item : box) {
            result += item.getWeight();
        }
        return result;
    }

    public boolean compare(Box<? extends Fruit> other){
        return weight() == other.weight();
    }

    public void cope(Box<? super T> other){
        for (T item : box) {
            other.add(item);
        }
        box.clear();
    }
}
