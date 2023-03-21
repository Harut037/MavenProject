package org.example.data;

public enum Planets {


    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);

    private final String NAME;

    private final int YEAR_LENGTH;

    public int getYearLength() {
        return YEAR_LENGTH;
    }

    public String getName() {
        return NAME;
    }


    Planets(String name, int yearLength) {
        this.NAME= name;
        this.YEAR_LENGTH = yearLength;
    }

    public void planets(Planets planet) {
        switch (planet) {
            case MERCURY:
                System.out.println(Planets.MERCURY.getName() + ":" + "  Number of earth days on each planet = " + Planets.MERCURY.getYearLength());
                break;
            case VENUS:
                System.out.println(Planets.VENUS.getName() + ":" + "  Number of earth days on each planet = " + Planets.VENUS.getYearLength());
                break;
            case EARTH:
                System.out.println(Planets.EARTH.getName() + ":" + "  Number of earth days on each planet = " + Planets.EARTH.getYearLength());
                break;
            case MARS:
                System.out.println(Planets.MARS.getName() + ":" + "  Number of earth days on each planet = " + Planets.MARS.getYearLength());
                break;
            case JUPITER:
                System.out.println(Planets.JUPITER.getName() + ":" + "  Number of earth days on each planet = " + Planets.JUPITER.getYearLength());
                break;
            case SATURN:
                System.out.println(Planets.SATURN.getName() + ":" + "  Number of earth days on each planet = " + Planets.SATURN.getYearLength());
                break;
            case URANUS:
                System.out.println(Planets.URANUS.getName() + ":" + "  Number of earth days on each planet = " + Planets.URANUS.getYearLength());
                break;
            case NEPTUNE:
                System.out.println(Planets.NEPTUNE.getName() + ":" + "  Number of earth days on each planet = " + Planets.NEPTUNE.getYearLength());
                break;
        }
    }
}
