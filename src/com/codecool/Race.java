package com.codecool;

import java.util.*;

public class Race {

    private int numOfRacingVehicles = 30;

    private List<Vehicle> vehicleList = new ArrayList<>();

    public static void main(String[] args) {
        Race race = new Race();
	    race.createVehicles();
	    //simulateRace();
	    race.printRaceResults();
    }

    private void createVehicles(){
        while (vehicleList.size() != numOfRacingVehicles) {
            vehicleList.add(new Car());
            vehicleList.add(new Motorcycle());
            vehicleList.add(new Truck());
        }
    }

    private void simulateRace() {

    }

    private void printRaceResults() {
        for (int i = 0; i < vehicleList.size(); i++) {
            String vehicleName = vehicleList.get(i).name();
            System.out.print(i+1 + ". ");
            System.out.println(vehicleName);
        }

    }

    private boolean isThereABrokenTruck(){
        return true;
    }

}
