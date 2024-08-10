package ru.otus.java.basic.safarov.homework07;

public class Bicycle extends Transport implements MoveTransport {
    private final String successful =  "С помощью велосипеда " + name + " удалось переместиться по";
    private final String failed =  "С помощью велосипеда " + name + " не удалось переместиться по ";
    private final String impossible =  "На велосипеде нельзя перемещаться по ";

    public Bicycle(String name, int maxResource, int consumption) {
        super(name, maxResource, consumption);
    }

    @Override
    public boolean moveDenseForest(int distance) {
        if (distance * consumption > currentResource) {
            currentResource = 0;
            System.out.println(failed + " густому лесу на "
                    + distance + ". Не хватило сил.");
            return false;
        }
        currentResource -= distance * consumption;
        System.out.println(successful + " густому лесу на "
                + distance + ".");
        return true;
    }

    @Override
    public boolean movePlain(int distance) {
        if (distance * consumption > currentResource) {
            currentResource = 0;
            System.out.println(failed + " равнине на "
                    + distance + ". Не хватило сил.");
            return false;
        }
        currentResource -= distance * consumption;
        System.out.println(successful + " равнине на "
                + distance + ".");
        return true;
    }

    @Override
    public boolean moveSwamp(int distance) {
        System.out.println(impossible + " болоту");
        return false;
    }

    protected void setResource(int value){
        this.maxResource = value;
        this.currentResource = value;
    }
}
