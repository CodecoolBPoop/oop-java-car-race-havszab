package com.codecool;

public class Weather {

    public Weather() {
        setRaining();
    }

    static boolean isRaining = false;

    static void setRaining(){
        isRaining = Randutil.generateNumInRange(10) <= 3;
    }
}
