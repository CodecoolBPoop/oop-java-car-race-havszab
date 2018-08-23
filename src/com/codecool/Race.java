package com.codecool;

import java.util.*;

public class Race {

    public Race(){

    }

    private int numOfRacingVehicles = 30;
    boolean isThereABrokenTruck = false;
    int speedEnabledWhileTruckIsBroken = 75;
    public static boolean isRaining = false;
    private Vehicle fastest;

    private List<Vehicle> vehicleList = new ArrayList<>();
    protected static List<Integer> breakDownsLeftList = new ArrayList<>();

    public static void main(String[] args) {
        Race race = new Race();
	    race.createVehicles();
	    race.simulateRace();
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
        for (int i = 0; i <= 49; i++) {
            Race race = new Race();
            Weather weather = new Weather();
            weather.setRaining();
            isRaining = weather.isRaining;
            breakDownsLeftList.clear();
            int index = 0;
            isThereABrokenTruck = false;
            for (int j = 0; j <= 29; j++) {
                if (vehicleList.get(j) instanceof Truck) {
                    ((Truck) vehicleList.get(j)).breakDownCheck(race);
                    if (breakDownsLeftList.get(index) != 0)
                        isThereABrokenTruck = true;
                    index++;
                }
            }
            for (int j = 0; j <= 29; j++) {
                vehicleList.get(j).moveForAnHour(race);
            }
        }
    }

    private void printRaceResults() {
        for (int i = 0; i < vehicleList.size(); i++) {
            String vehicleName = vehicleList.get(i).name;
            int distance = vehicleList.get(i).distanceTraveled;
            try {
                if (distance > fastest.distanceTraveled)
                    fastest = vehicleList.get(i);
            } catch (NullPointerException nullE) {
                fastest = vehicleList.get(i);
            }
            System.out.print(i+1 + ". ");
            System.out.print(vehicleName + ": ");
            System.out.print(distance + " km");
            System.out.println(" ");
        }
        System.out.println("------------------------------------" );
        System.out.println("The fastest vehicle was " + fastest.name + " with " + fastest.distanceTraveled + " km.");
        System.out.println("Average speed: " + fastest.distanceTraveled/50 + " km/h");
        System.out.println("------------------------------------" );

    }

    public void setBreakDownsLeftList(Integer element) {
        breakDownsLeftList.add(element);
    }


}
