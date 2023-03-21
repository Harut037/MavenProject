package org.example.enums.homework_3;

public enum SolarSystem {
    MERCURY("Mercury", 0.330E24) {
        @Override
        public void massOfPlanets() {
            System.out.println(getNAME() + "`s mass = " + getMASS_OF_PLANETS() + " kg");
        }

        @Override
        public double distanceFromSun() {
            System.out.print("\nDistance from " + getNAME() + " to Sun = ");
            return 65210000;
        }
    },
    VENUS("Venus", 4.87E24) {
        @Override
        public void massOfPlanets() {
            System.out.println(getNAME() + "`s mass = " + getMASS_OF_PLANETS() + " kg");
        }

        @Override
        public double distanceFromSun() {
            System.out.print("\nDistance from " + getNAME() + " to Sun = ");
            return 108000000;
        }
    },
    EARTH("Earth", 5.97E24) {
        @Override
        public void massOfPlanets() {
            System.out.println(getNAME() + "`s mass = " + getMASS_OF_PLANETS() + " kg");
        }

        @Override
        public double distanceFromSun() {
            System.out.print("\nDistance from " + getNAME() + " to Sun = ");
            return 149600000;
        }
    },
    MARS("Mars", 0.642E24) {
        @Override
        public void massOfPlanets() {
            System.out.println(getNAME() + "`s mass = " + getMASS_OF_PLANETS() + " kg");
        }

        @Override
        public double distanceFromSun() {
            System.out.print("\nDistance from " + getNAME() + " to Sun = ");
            return 244950000;
        }
    },
    JUPITER("Jupiter", 1898E24) {
        @Override
        public void massOfPlanets() {
            System.out.println(getNAME() + "`s mass = " + getMASS_OF_PLANETS() + " kg");
        }

        @Override
        public double distanceFromSun() {
            System.out.print("\nDistance from " + getNAME() + " to Sun = ");
            return 778547200;
        }
    },
    SATURN("Saturn", 568E24) {
        @Override
        public void massOfPlanets() {
            System.out.println(getNAME() + "`s mass = " + getMASS_OF_PLANETS() + " kg");
        }

        @Override
        public double distanceFromSun() {
            System.out.print("\nDistance from " + getNAME() + " to Sun = ");
            return 1.4672E9;
        }
    },
    URANUS("Uranus", 86.8E24) {
        @Override
        public void massOfPlanets() {
            System.out.println(getNAME() + "`s mass = " + getMASS_OF_PLANETS() + " kg");
        }

        @Override
        public double distanceFromSun() {
            System.out.print("\nDistance from " + getNAME() + " to Sun = ");
            return 2.9402E9;
        }
    },
    NEPTUNE("Neptune", 102E24) {
        @Override
        public void massOfPlanets() {
            System.out.println(getNAME() + "`s mass = " + getMASS_OF_PLANETS() + " kg");
        }

        @Override
        public double distanceFromSun() {
            System.out.print("\nDistance from " + getNAME() + " to Sun = ");
            return 4.4734E9;
        }
    };

    private final String NAME;

    private final double MASS_OF_PLANETS;

    public String getNAME() {
        return NAME;
    }

    public double getMASS_OF_PLANETS() {
        return MASS_OF_PLANETS;
    }

    SolarSystem(String NAME, double MASS_OF_PLANETS) {
        this.NAME = NAME;
        this.MASS_OF_PLANETS = MASS_OF_PLANETS;
    }

    /**
     * This abstract has implemented eight times, this method give us distance from Sun:
     *
     * @return
     */
    public abstract double distanceFromSun();

    public abstract void massOfPlanets();

    public void listOfPlanets() {
        System.out.println(MERCURY.distanceFromSun());
        MERCURY.massOfPlanets();
        System.out.println(VENUS.distanceFromSun());
        VENUS.massOfPlanets();
        System.out.println(EARTH.distanceFromSun());
        EARTH.massOfPlanets();
        System.out.println(MARS.distanceFromSun());
        MARS.massOfPlanets();
        System.out.println(JUPITER.distanceFromSun());
        JUPITER.massOfPlanets();
        System.out.println(SATURN.distanceFromSun());
        SATURN.massOfPlanets();
        System.out.println(URANUS.distanceFromSun());
        URANUS.massOfPlanets();
        System.out.println(NEPTUNE.distanceFromSun());
        NEPTUNE.massOfPlanets();

    }

}
