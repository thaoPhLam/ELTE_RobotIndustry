package com.codecool.thao.robotindustry.robot;

public class Pro extends Robot {
    public Pro(String name, int battery) {
        super(name, battery);
        this.batteryCapacity = 12;
        this.transportCapacity = 8;
    }

    @Override
    public void deliverBox() {
        this.battery -= 1;
    }
}
