package com.codecool;

public class Truck extends Vehicle {

    public Truck() {
        this.name();
    }


    Randutil randutil = new Randutil();
    public int distanceTraveled = 0;
    public int breakDownTurnsLeft = 0;

    @Override
    protected String name() {
        String truckName = randutil.generateNumInRange(1000) + "";
        return truckName;
    }

    @Override
    protected void moveForAnHour(Race race) {
        int breakDownChance = randutil.generateNumInRange(20); //Chance is 1 to 20 (5%)
        if (breakDownChance == 1)
            breakDownTurnsLeft = 2;
        if (breakDownTurnsLeft == 0)
            if (race.isThereABrokenTruck == false)
                distanceTraveled += 100;
            else distanceTraveled += race.speedEnabledWhileTruckIsBroken;
    }

}
