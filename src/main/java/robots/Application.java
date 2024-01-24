package main.java.robots;

import main.java.robots.robot.AdvancedRobot;
import main.java.robots.robot.PrimitiveRobot;
import main.java.robots.robot.Robot;
import main.java.robots.robot.StandartRobot;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomInt = rand.nextInt(12) + 1;

        String name = "Sam";
        Robot robot;
        if (randomInt <= 3) {
            robot = new PrimitiveRobot(name);
        } else if (randomInt <= 8) {
            robot = new StandartRobot(name);
        } else {
            robot = new AdvancedRobot(name);
        }
        System.out.printf("My name is %s.%nMy current version is \"%s\".%nI can say to you: %s%n",
                robot.getName(), robot.getVersionNumber(), robot.startYelling());
        System.out.printf("Moving abilities: %s%n", robot.move());
        System.out.printf("If you give me a weapon: %s%n", robot.shoot());
        System.out.printf("I can demonstrate my strong defence: %s%n", robot.defence());

    }
}
