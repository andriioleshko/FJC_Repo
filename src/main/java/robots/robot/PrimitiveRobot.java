package main.java.robots.robot;

import main.java.robots.actions.Move;
import main.java.robots.actions.Shoot;
import main.java.robots.actions.Yell;

public class PrimitiveRobot extends Robot implements Yell, Move, Shoot {
    public PrimitiveRobot(String name) {
        super(name, TypeOfRobot.PRIMITIVE);
    }

    @Override
    public String startYelling() {
        return "I can't yell at you, Master.";
    }

    @Override
    public String move() {
        return "I cannot move.";
    }

    @Override
    public String shoot() {
        return "I'll try my best to shoot.";
    }
}
