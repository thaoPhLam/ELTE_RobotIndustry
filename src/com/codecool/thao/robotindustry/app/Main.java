package com.codecool.thao.robotindustry.app;

import com.codecool.thao.robotindustry.Industry;
import com.codecool.thao.robotindustry.robot.Eco;
import com.codecool.thao.robotindustry.robot.Mac;
import com.codecool.thao.robotindustry.robot.Pro;

public class Main {
    public static void main(String[] args) {
        Industry industry = new Industry();

        industry.turnOnRobot(new Mac("MM10", 4));
        industry.turnOnRobot(new Eco("E5", 4));
        industry.turnOnRobot(new Pro("PX", 10));
        industry.turnOnRobot(new Eco("E12", 4));

        industry.simulateWorkDay(3, 20);
        industry.simulateWorkDay(2, 32);
        industry.simulateWorkDay(5, 20);
        industry.simulateWorkDay(3, 16);

    }
}
