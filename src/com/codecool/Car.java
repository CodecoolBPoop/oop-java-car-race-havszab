package com.codecool;

public class Car extends Vehicle {

    public Car() {
        this.name();
    }

    String[] carNames = {"Oracle", "Universe", "Guardian", "Crusader", "Presence",
            "Hollo", "Pyre", "Crux", "Tarragon", "Spirit",
            "Dynamics", "Union", "Nimbus", "Virtue", "Treasure",
            "Flux", "Passion", "Paragon", "Wish", "Avalanche"};

    Randutil randutil = new Randutil();

    @Override
    protected String name() {
        String firstName = carNames[randutil.generateNumInRange(carNames.length - 1)];
        String lastName = carNames[randutil.generateNumInRange(carNames.length - 1)];
        return firstName + " " + lastName;
    }

    @Override
    protected int distanceTraveled() {
        return 0;
    }

    @Override
    protected void moveForAnHour(Race race) {

    }

}
