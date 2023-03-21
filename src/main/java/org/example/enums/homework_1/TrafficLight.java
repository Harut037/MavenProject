package org.example.enums.homework_1;

public enum TrafficLight {

    RED("red",25),
    YELLOW("yellow",5),
    GREEN("green",30);

    private final String COLOR;

    private final int SECONDS;

    public String getCOLOR() {
        return COLOR;
    }

    public int getSECONDS() {
        return SECONDS;
    }

    TrafficLight(String COLOR, int SECONDS) {
        this.COLOR = COLOR;
        this.SECONDS = SECONDS;
    }
}
