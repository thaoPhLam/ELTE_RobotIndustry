package com.codecool.thao.robotindustry.robot;

public class Eco extends Robot {
    public Eco(String name, int battery) {
        super(name, battery);
        this.batteryCapacity = 4;
        this.transportCapacity = 6;
    }

    @Override
    public void deliverBox() {
        this.battery -= 1;
    }
}
