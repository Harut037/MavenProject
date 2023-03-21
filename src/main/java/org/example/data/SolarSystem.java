package org.example.data;

public enum SolarSystem {

//    Write an enum representing the different types of planets in our solar
//   system, with each planet having a method to return its distance from the sun.

    MERCURY("Mercury"){
        @Override
        public double distanceFromSun() {
            System.out.print("Distance from " + getName() + " to Sun = ");
            return 65210000;
        }
    },
    VENUS("Venus"){
        @Override
        public double distanceFromSun() {
            System.out.print("Distance from " + getName() + " to Sun = ");
            return 108000000;
        }
    },
    EARTH("Earth"){
        @Override
        public double distanceFromSun() {
            System.out.print("Distance from " + getName() + " to Sun = ");
            return 149600000;
        }
    },
    MARS("Mars"){
        @Override
        public double distanceFromSun() {
            System.out.print("Distance from " + getName() + " to Sun = ");
            return 244950000;
        }
    },
    JUPITER("Jupiter"){
        @Override
        public double distanceFromSun() {
            System.out.print("Distance from " + getName() + " to Sun = ");
            return 778547200;
        }
    },
    SATURN("Saturn"){
        @Override
        public double distanceFromSun() {
            System.out.print("Distance from " + getName() + " to Sun = ");
            return 1.4672E9;
        }
    },
    URANUS("Uranus"){
        @Override
        public double distanceFromSun() {
            System.out.print("Distance from " + getName() + " to Sun = ");
            return 2.9402E9;
        }
    },
    NEPTUNE("Neptune"){
        @Override
        public double distanceFromSun() {
            System.out.print("Distance from " + getName() + " to Sun = ");
            return 4.4734E9;
        }
    };

    private final String NAME;




    public String getName() {
        return NAME;
    }


    SolarSystem(String name) {
        this.NAME = name;

    }

    /**
     * This abstract has implemented eight times, this method give us distance from Sun:
     * @return
     */
    public abstract double distanceFromSun();
}
