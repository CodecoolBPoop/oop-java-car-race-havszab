package com.codecool;

import java.util.Random;

public class Randutil {

    public static int generateNumInRange(int range) {
        Random rand = new Random();
        int randInt = rand.nextInt(range) + 1;
        return randInt;
    }

}
