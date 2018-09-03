package com.codecool;

public abstract class Vehicle {

    int distanceTraveled = 0;

    String name;

    protected abstract void name();

    protected abstract void moveForAnHour(Race race);

}
