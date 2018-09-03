package com.codecool;

public class Motorcycle extends Vehicle {

    public Motorcycle() {
        this.name();
    }

    private static int nameNumber = 0;
    private static final int MIN_SPEED = 5;

    @Override
    protected void name() {
        nameNumber += 1;
        this.name = "Motorcycle " + (nameNumber);
    }

    @Override
    protected void moveForAnHour(Race race) {
        int maxSpeed = 100;
        if (Race.isRaining)
            maxSpeed -= Randutil.generateNumInRange(45) + MIN_SPEED-1;
        if (race.isThereABrokenTruck)
            if (maxSpeed >= Race.SPEED_ENABLEED_WHILE_TRUCK_IS_BROKEN)
                maxSpeed = Race.SPEED_ENABLEED_WHILE_TRUCK_IS_BROKEN;
        distanceTraveled += maxSpeed;
    }

}
