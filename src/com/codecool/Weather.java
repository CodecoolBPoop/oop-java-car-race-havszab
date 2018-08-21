package com.codecool;

public class Weather {


    public static boolean isRaining = false;

    private static void setRaining(){
        if (Randutil.generateNumInRange(10) <= 3){
            isRaining = true;
        } else {
            isRaining = false;
        }
    }
}
