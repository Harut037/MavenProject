package org.example.enums.homework_4;

import java.util.Scanner;

public enum DayOfWeek {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);


    private final String DAYS_OF_WEEK;

    private final int NUMBER_OF_DAYS;

    public String getDAYS_OF_WEEK() {
        return DAYS_OF_WEEK.toUpperCase();
    }

    public int getNUMBER_OF_DAYS() {
        return NUMBER_OF_DAYS;
    }

    DayOfWeek(String DAYS_OF_WEEK, int NUMBER_OF_DAYS) {
        this.DAYS_OF_WEEK = DAYS_OF_WEEK;
        this.NUMBER_OF_DAYS = NUMBER_OF_DAYS;
    }

    /**
     * This method include method findDay.
     */
    public void whichIsDay() {
        System.out.print("\nEnter day of the week or number that day:  ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        int it = 0;
        switch (input) {
            case "1":
                it = 1;
                break;
            case "2":
                it = 2;
                break;
            case "3":
                it = 3;
                break;
            case "4":
                it = 4;
                break;
            case "5":
                it = 5;
                break;
            case "6":
                it = 6;
                break;
            case "7":
                it = 7;
                break;
            default:
        }
        System.out.println();
        findDay(input, it);

    }

    /**
     * This method find and print, our day is weekend day or weekday.
     * @param input
     * @param it
     */
    public void findDay(String input, int it) {
        if (input.equals(SATURDAY.getDAYS_OF_WEEK()) || it == SATURDAY.NUMBER_OF_DAYS) {
            System.out.println(SATURDAY.getDAYS_OF_WEEK() + " is a weekend day.");
        } else if (input.equals(SUNDAY.getDAYS_OF_WEEK()) || it == SUNDAY.NUMBER_OF_DAYS) {
            System.out.println(SUNDAY.getDAYS_OF_WEEK() + " is a weekend day.");
        } else if (input.equals(MONDAY.getDAYS_OF_WEEK()) || it == MONDAY.NUMBER_OF_DAYS) {
            System.out.println(MONDAY.DAYS_OF_WEEK + " is a weekday.");
        } else if (input.equals(TUESDAY.getDAYS_OF_WEEK()) || it == TUESDAY.NUMBER_OF_DAYS) {
            System.out.println(TUESDAY.DAYS_OF_WEEK + " is a weekday.");
        } else if (input.equals(WEDNESDAY.getDAYS_OF_WEEK()) || it == WEDNESDAY.NUMBER_OF_DAYS) {
            System.out.println(WEDNESDAY.DAYS_OF_WEEK + " is a weekday.");
        } else if (input.equals(THURSDAY.getDAYS_OF_WEEK()) || it == THURSDAY.NUMBER_OF_DAYS) {
            System.out.println(THURSDAY.DAYS_OF_WEEK + " is a weekday.");
        } else if (input.equals(FRIDAY.getDAYS_OF_WEEK()) || it == FRIDAY.NUMBER_OF_DAYS) {
            System.out.println(FRIDAY.DAYS_OF_WEEK + " is a weekday.");
        } else {
            System.out.print("\nEnter invalid day or number that day: ");
            whichIsDay();
        }
    }
}
