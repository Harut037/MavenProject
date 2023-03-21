package org.example.enums.homework_2;

import java.util.Scanner;

public enum CoffeeSizes {
    SMALL("small", 200),
    MEDIUM("medium", 350),
    BIG("big", 600);


    private final String SIZE_OF_COFFEE;
    private final int VALUE_OF_COFFEE;

    public String getSIZE_OF_COFFEE() {
        return SIZE_OF_COFFEE;
    }

    public int getVALUE_OF_COFFEE() {
        return VALUE_OF_COFFEE;
    }

    CoffeeSizes(String SIZE_OF_COFFEE, int VALUE_OF_COFFEE) {
        this.SIZE_OF_COFFEE = SIZE_OF_COFFEE;
        this.VALUE_OF_COFFEE = VALUE_OF_COFFEE;
    }

    /**
     * This method give us our choosing coffee`s value.
     */
    public void chooseSizeOfCoffee() {
        System.out.println("\n What size of coffee would you like (we have three sizes, those are` [ small, medium, big ]");
        System.out.print("\n Enter the size, what you want:  ");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextLine()) {
            case "small":
                System.out.println("\n The " + SMALL.getSIZE_OF_COFFEE() + " size costs a " + SMALL.getVALUE_OF_COFFEE() + " amd.");
                break;
                case "medium":
                System.out.println("\n The " + MEDIUM.getSIZE_OF_COFFEE() + " size costs a " + MEDIUM.getVALUE_OF_COFFEE() + " amd.");
                break;
                case "big":
                System.out.println("\n The " + BIG.getSIZE_OF_COFFEE() + " size costs a " + BIG.getVALUE_OF_COFFEE() + " amd.");
                break;
            default:
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println("\n You must choose in this` [ small, medium, big ] ");
                chooseSizeOfCoffee();
        }

    }
}
