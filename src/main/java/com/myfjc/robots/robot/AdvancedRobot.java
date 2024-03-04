package com.myfjc.robots.robot;

import com.myfjc.robots.actions.Defence;
import com.myfjc.robots.actions.Move;
import com.myfjc.robots.actions.Shoot;
import com.myfjc.robots.actions.Yell;

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
