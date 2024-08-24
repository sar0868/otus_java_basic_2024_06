package ru.otus.java.basic.safarov.homework07;

public abstract class Transport {
    protected final String name;
    protected int maxResource;
    protected int consumption;
    protected int currentResource;
    protected boolean isFull;
    protected String typeTransort;

    public Transport(String name, int maxResource, int consumption) {
        this.name = name;
        this.maxResource = maxResource;
        this.consumption = consumption;
        this.currentResource = this.maxResource;
        this.isFull = true;
    }

    public String getName() {
        return name;
    }

    public int getMaxResource() {
        return maxResource;
    }

    public int getConsumption() {
        return consumption;
    }

    public int getCurrentResource() {
        return currentResource;
    }

    public boolean isFull() {
        return isFull;
    }

    public String getMsgImposoble() {
        return ". " + getTypeTransort() + "Условия не подходят. Переместиться не удалось.";
    }

    public String getTypeTransort() {
        return "Транспорт " + typeTransort + " " + name + ". ";
    }

    public void replenishment(int resource){
        if(isFull){
            System.out.println(name + " ресурсы на максимуме");
            return;
        }
        currentResource += (maxResource - currentResource >= resource)? resource: maxResource;
        System.out.println(name + " ресурсы восполнены");
        isFull = (maxResource == currentResource);
    }

}
