package com.codecool.thao.robotindustry;

import com.codecool.thao.robotindustry.robot.Robot;

import java.util.ArrayList;
import java.util.List;

public class Industry {
    private List<Robot> robots = new ArrayList<>();

    public void turnOnRobot(Robot robot) {
        robots.add(robot);
    }

    public void simulateWorkDay(int amount, int numOfIncomingBoxes) {
        for (Robot robot : robots) {
            robot.loadUpBattery(amount);
            robot.deliverBox(numOfIncomingBoxes);
            System.out.println(robot);
        }
    }
}
