package com.myfjc.robots.robot;

public enum TypeOfRobot {
    PRIMITIVE("1.0.0"),
    STANDARD("1.0.3"),
    ADVANCED("1.1.0");

    private final String versionNumber;

    TypeOfRobot(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getVersionNumber() {
        return versionNumber;
    }
}



