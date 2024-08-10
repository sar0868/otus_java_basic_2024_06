package ru.otus.java.basic.safarov.homework07;

public class Horse extends Transport implements MoveTransport {

    private final String successful =  "С помощью лошади " + name + " удалось переместиться по";
    private final String failed =  "С помощью лошади " + name + " не удалось переместиться по ";
    private final String impossible =  "Лошадь не может перемещаться по ";

    public Horse(String name, int maxResource, int consumption) {
        super(name, maxResource, consumption);
    }

    @Override
    public boolean moveDenseForest(int distance) {
        if (distance * consumption > currentResource) {
            currentResource = 0;
            System.out.println(failed + " густому лесу на "
                    + distance + ". Лошади не хватило сил.");
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
                    + distance + ". Лошади не хватило сил.");
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
}
