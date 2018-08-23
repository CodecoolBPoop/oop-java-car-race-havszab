package com.codecool;

public class Weather {

    public Weather() {
        setRaining();
    }


    public static boolean isRaining = false;

    public static void setRaining(){
        if (Randutil.generateNumInRange(10) <= 3){
            isRaining = true;
        } else {
            isRaining = false;
        }
    }
}
