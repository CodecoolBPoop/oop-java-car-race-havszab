package com.codecool;

public class Motorcycle extends Vehicle {

    public Motorcycle() {
        this.name();
    }

    protected static int nameNumber = 0;

    @Override
    protected String name() {
        nameNumber += 1;
        return "Motorcycle " + (nameNumber-10);
    }

    @Override
    protected int distanceTraveled() {
        return 0;
    }

    @Override
    protected void moveForAnHour(Race race) {

    }

}
