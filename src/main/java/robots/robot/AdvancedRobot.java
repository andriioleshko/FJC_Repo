package main.java.robots.robot;

import main.java.robots.actions.Defence;
import main.java.robots.actions.Move;
import main.java.robots.actions.Shoot;
import main.java.robots.actions.Yell;

public class AdvancedRobot extends Robot implements Yell, Move, Shoot, Defence {
    public AdvancedRobot(String name) {
        super(name, TypeOfRobot.ADVANCED);
    }

    @Override
    public String startYelling() {
        return "Oy! What you are looking at?";
    }

    @Override
    public String move() {
        return "I'm going anywhere I want!";
    }

    @Override
    public String shoot() {
        return "Aware, I'm shooting like a pro!";
    }
}
