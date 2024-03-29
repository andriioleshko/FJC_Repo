package main.java.robots.robot;

import main.java.robots.actions.Defence;
import main.java.robots.actions.Move;
import main.java.robots.actions.Shoot;
import main.java.robots.actions.Yell;

public abstract class Robot implements Shoot, Move, Yell, Defence {
    private final String name;
    private final TypeOfRobot typeOfRobot;

    public Robot(String name, TypeOfRobot typeOfRobot) {
        this.name = name;
        this.typeOfRobot = typeOfRobot;
    }

    public String getName() {
        return name;
    }

    public String getVersionNumber() {
        return typeOfRobot.getVersionNumber();
    }

    @Override
    public abstract String move();

    @Override
    public abstract String shoot();

    @Override
    public abstract String startYelling();

    @Override
    public String defence() {
        return "Nobody can't override my functions and force to do what is banned for me when I was created :).";
    }
}
