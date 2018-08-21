package com.codecool;

public class Truck extends Vehicle {

    public Truck() {
        this.name();
    }


    Randutil randutil = new Randutil();

    @Override
    protected String name() {
        String truckName = randutil.generateNumInRange(1000) + "";
        return truckName;
    }

    @Override
    protected int distanceTraveled() {
        return 0;
    }

    @Override
    protected void moveForAnHour(Race race) {

    }

}
