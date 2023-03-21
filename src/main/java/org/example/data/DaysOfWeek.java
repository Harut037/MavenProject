package org.example.data;

public enum DaysOfWeek {

//    Create an enum representing the days of the week, and write a method to
//    return the number of the day.

    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);


    private final String DAYS_OF_WEEK;


    private final int NUMBER_OF_DAYS;

    public int getNumberOfDays() {
        return NUMBER_OF_DAYS;
    }

    public String getDaysOfWeek() {
        return DAYS_OF_WEEK;
    }

    DaysOfWeek(String daysOfWeek, int numberOfDays) {
        this.DAYS_OF_WEEK = daysOfWeek;
        this.NUMBER_OF_DAYS = numberOfDays;
    }


    public int getDayNumber(DaysOfWeek day) {
        switch (day) {
            case MONDAY:
                return 1;
            case TUESDAY:
                return 2;
            case WEDNESDAY:
                return 3;
            case THURSDAY:
                return 4;
            case FRIDAY:
                return 5;
            case SATURDAY:
                return 6;
            case SUNDAY:
                return 7;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
    }

}
