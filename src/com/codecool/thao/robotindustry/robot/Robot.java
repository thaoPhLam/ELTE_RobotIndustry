package com.codecool.thao.robotindustry.robot;

public abstract class Robot {
    protected String name;
    protected int battery;
    protected int batteryCapacity;
    protected int numOfBoxes;
    protected int transportCapacity;
    protected int numOfBoxesWaitingForDelivery;

    public Robot(String name, int battery) {
        this.name = name;
        this.battery = battery;
        this.numOfBoxes = Math.min(transportCapacity, numOfBoxesWaitingForDelivery);
    }

    public void loadUpBattery(int amount) {
        this.battery += amount;
        if (this.battery > this.batteryCapacity) {
            this.battery = this.batteryCapacity;
        }
    }

    public abstract void deliverBox(int numOfBoxes);

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", battery=" + battery +
                ", numOfBoxesWaitingForDelivery=" + numOfBoxesWaitingForDelivery +
                '}';
    }
}
