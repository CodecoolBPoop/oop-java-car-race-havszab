package com.codecool;

public class Truck extends Vehicle {

    public Truck() {
        this.name();
    }

    public int breakDownTurnsLeft = 0;

    @Override
    protected void name() {
        this.name = randutil.generateNumInRange(1000) + "";

    }

    @Override
    protected void moveForAnHour(Race race) {
        if (breakDownTurnsLeft == 0) {
            if (!race.isThereABrokenTruck)
                distanceTraveled += 100;
            else distanceTraveled += race.speedEnabledWhileTruckIsBroken;
        }
    }

    protected void breakDownCheck(Race race) {
        if (breakDownTurnsLeft == 0) {
            int breakDownChance = randutil.generateNumInRange(20); //Chance is 1 to 20 (5%)
            if (breakDownChance == 1) { // Truck is broken:
                breakDownTurnsLeft = 2;
                race.isThereABrokenTruck = true;
            }
        } else if (breakDownTurnsLeft > 0){
            breakDownTurnsLeft -= 1;
        }
        race.setBreakDownsLeftList(breakDownTurnsLeft);
    }


}
