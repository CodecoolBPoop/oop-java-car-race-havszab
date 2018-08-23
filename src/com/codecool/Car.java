package com.codecool;

public class Car extends Vehicle {

    public Car() {
        this.name();
    }


    private String[] carNames = {"Oracle", "Universe", "Guardian", "Crusader", "Presence",
            "Hollo", "Pyre", "Crux", "Tarragon", "Spirit",
            "Dynamics", "Union", "Nimbus", "Virtue", "Treasure",
            "Flux", "Passion", "Paragon", "Wish", "Avalanche"};

    private int minSpeed = 80;

    @Override
    protected void name() {
        String firstName = carNames[randutil.generateNumInRange(carNames.length - 1)];
        String lastName = carNames[randutil.generateNumInRange(carNames.length - 1)];
        this.name = firstName + " " + lastName;
    }

    @Override
    protected void moveForAnHour(Race race) {
        if (race.isThereABrokenTruck == true){
            distanceTraveled += 75;
        } else {
            distanceTraveled += (randutil.generateNumInRange(30) + minSpeed - 1);
        }
    }

}
