package com.codecool;

public class Car extends Vehicle {

    public Car() {
        this.name();
    }

    private String[] carNames = {"Oracle", "Universe", "Guardian", "Crusader", "Presence",
            "Hollo", "Pyre", "Crux", "Tarragon", "Spirit",
            "Dynamics", "Union", "Nimbus", "Virtue", "Treasure",
            "Flux", "Passion", "Paragon", "Wish", "Avalanche"};

    protected int distanceTraveled = 0;

    private int minSpeed = 80;

    Randutil randutil = new Randutil();

    @Override
    protected String name() {
        String firstName = carNames[randutil.generateNumInRange(carNames.length - 1)];
        String lastName = carNames[randutil.generateNumInRange(carNames.length - 1)];
        return firstName + " " + lastName;
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
