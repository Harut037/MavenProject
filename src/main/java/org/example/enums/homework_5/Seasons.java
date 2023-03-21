package org.example.enums.homework_5;

import java.util.Scanner;

public enum Seasons {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private final String NAMES_OF_SEASONS;

    public String getNAMES_OF_SEASONS() {
        return NAMES_OF_SEASONS;
    }


    Seasons(String NAMES_OF_SEASONS) {
        this.NAMES_OF_SEASONS = NAMES_OF_SEASONS;
    }


    /**
     * This method using temperature and find what season is now.
     */
    public void findSeason(){
        System.out.print("\nEnter temperature = ");
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        if (temperature < 8 && temperature > - 51){
            System.out.println("\nThe temperature corresponds to " + WINTER.getNAMES_OF_SEASONS()+ ".");
        } else
        if (temperature > 7 && temperature < 21){
            System.out.println("\nThe temperature corresponds to " + SPRING.getNAMES_OF_SEASONS() + " or " + AUTUMN.getNAMES_OF_SEASONS() +".");
        } else
        if (temperature > 20 && temperature < 50){
            System.out.println("\nThe temperature corresponds to " + SUMMER.getNAMES_OF_SEASONS() + ".");
        }
        else {
            System.out.println("\nPlease enter possible temperature");
            findSeason();
        }
    }
}
