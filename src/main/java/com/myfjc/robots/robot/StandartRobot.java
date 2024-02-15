package com.myfjc.robots.robot;

import com.myfjc.robots.actions.Move;
import com.myfjc.robots.actions.Shoot;
import com.myfjc.robots.actions.Yell;

public class StandartRobot extends Robot implements Yell, Move, Shoot {
    public StandartRobot(String name) {
        super(name, TypeOfRobot.STANDARD);
    }

    @Override
    public String startYelling() {
        return "Hey!";
    }

    @Override
    public String move() {
        return "I can move only forward and make turns.";
    }

    @Override
    public String shoot() {
        return "Need some preparations and I will shoot where you are pointing at.";
    }
}
