package com.codecool;

import java.util.*;

public class Race {

    public Race(){

    }

    private static final int NUM_OF_RACING_VEHICLES = 30;
    static final int SPEED_ENABLEED_WHILE_TRUCK_IS_BROKEN = 75;
    private static final int NUM_OF_HOURS = 50;

    boolean isThereABrokenTruck = false;
    static boolean isRaining = false;
    private Vehicle fastest;

    private List<Vehicle> vehicleList = new ArrayList<>();
    private static List<Integer> breakDownsLeftList = new ArrayList<>();

    public static void main(String[] args) {
        Race race = new Race();
	    race.createVehicles();
	    race.simulateRace();
	    race.printRaceResults();
    }

    private void createVehicles(){
        while (vehicleList.size() != NUM_OF_RACING_VEHICLES) {
            vehicleList.add(new Car());
            vehicleList.add(new Motorcycle());
            vehicleList.add(new Truck());
        }
    }

    private void simulateRace() {
        for (int i = 0; i < NUM_OF_HOURS; i++) {
            Race race = new Race();
            Weather.setRaining();
            isRaining = Weather.isRaining;
            breakDownsLeftList.clear();
            int index = 0;
            isThereABrokenTruck = false;
            for (int j = 0; j < NUM_OF_RACING_VEHICLES; j++) {
                if (vehicleList.get(j) instanceof Truck) {
                    ((Truck) vehicleList.get(j)).breakDownCheck(race);
                    if (breakDownsLeftList.get(index) != 0)
                        isThereABrokenTruck = true;
                    index++;
                }
            }
            for(Vehicle vehicle : vehicleList) {
                vehicle.moveForAnHour(race);
            }
        }
    }

    private void printRaceResults() {
        for (int i = 0; i < vehicleList.size(); i++) {
            String vehicleName = vehicleList.get(i).name;
            int distance = vehicleList.get(i).distanceTraveled;
            checkRank(i, distance);
            System.out.print(i+1 + ". ");
            System.out.print(vehicleName + ": ");
            System.out.print(distance + " km");
            System.out.println(" ");
        }
        printFastestVehicle();
    }

    private void checkRank(int i, int distance) {
        try {
            if (distance > fastest.distanceTraveled)
                fastest = vehicleList.get(i);
        } catch (NullPointerException nullE) {
            fastest = vehicleList.get(i);
        }
    }

    private void printFastestVehicle() {
        System.out.println("--------------------------------------------" );
        System.out.println("The fastest vehicle was " + fastest.name + " with " + fastest.distanceTraveled + " km.");
        System.out.println("Average speed: " + fastest.distanceTraveled/NUM_OF_HOURS + " km/h");
        System.out.println("--------------------------------------------" );

    }

    void setBreakDownsLeftList(Integer element) {
        breakDownsLeftList.add(element);
    }


}
