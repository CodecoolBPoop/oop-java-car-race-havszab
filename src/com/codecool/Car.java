package com.codecool;

public class Car extends Vehicle {

    public Car() {
        this.name();
    }


    private String[] carNames = {"Oracle", "Universe", "Guardian", "Crusader", "Presence",
            "Hollo", "Pyre", "Crux", "Tarragon", "Spirit",
            "Dynamics", "Union", "Nimbus", "Virtue", "Treasure",
            "Flux", "Passion", "Paragon", "Wish", "Avalanche"};

    private static final int MIN_SPEED = 80;

    @Override
    protected void name() {
        String firstName = carNames[Randutil.generateNumInRange(carNames.length - 1)];
        String lastName = carNames[Randutil.generateNumInRange(carNames.length - 1)];
        this.name = firstName + " " + lastName;
    }

    @Override
    protected void moveForAnHour(Race race) {
        if (race.isThereABrokenTruck){
            distanceTraveled += Race.SPEED_ENABLEED_WHILE_TRUCK_IS_BROKEN;
        } else {
            distanceTraveled += (Randutil.generateNumInRange(30) + MIN_SPEED - 1);
        }
    }

}
