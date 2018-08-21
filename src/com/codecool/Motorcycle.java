package com.codecool;

public class Motorcycle extends Vehicle {

    public Motorcycle() {
        this.name();
    }
    Randutil randutil = new Randutil();
    protected static int nameNumber = 0;
    public int distanceTraveled = 0;
    private int minSpeed = 5;


    @Override
    protected String name() {
        nameNumber += 1;
        return "Motorcycle " + (nameNumber-10);
    }


    @Override
    protected void moveForAnHour(Race race) {
        int maxSpeed = 100;
        if (race.isRaining == true)
            maxSpeed -= randutil.generateNumInRange(45) + minSpeed-1;
        if (race.isThereABrokenTruck == true )
            if (maxSpeed >= race.speedEnabledWhileTruckIsBroken)
                maxSpeed = race.speedEnabledWhileTruckIsBroken;
        distanceTraveled += maxSpeed;

    }

}