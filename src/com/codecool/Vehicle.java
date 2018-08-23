package com.codecool;

public abstract class Vehicle {

    Randutil randutil = new Randutil();

    public int distanceTraveled = 0;

    public String name;

    protected abstract void name();

    protected abstract void moveForAnHour(Race race);

}
