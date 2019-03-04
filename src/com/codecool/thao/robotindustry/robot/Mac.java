package com.codecool.thao.robotindustry.robot;

public class Mac extends Robot {
    public Mac(String name, int battery) {
        super(name, battery);
        this.batteryCapacity = 10;
        this.transportCapacity = 10;
    }

    @Override
    public void deliverBox(int numOfBoxes) {
        this.battery -= 1;

    }
}
