package com.cloudbusterdesigns.rockpaperscissors;

import java.util.Random;

/**
 * Created by mikkara on 15.12.2015.
 */
public class Computer {

    int choice;

    Random random = new Random();

    public Computer() {
        this.choice = random.nextInt(3);
    }

    public int getChoice() {
        return random.nextInt(3);
    }

}
