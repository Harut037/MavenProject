package org.example.data.exercise_5;

public enum Unit {
    METER{
        @Override
        public String getBaseUnit() {
            return "Meter";
        }
    },
    KILOGRAM{
        @Override
        public String getBaseUnit() {
            return "Kilogram";
        }
    },
    SECOND{
        @Override
        public String getBaseUnit() {
            return "Second";
        }
    },
    AMPERE{
        @Override
        public String getBaseUnit() {
            return null;
        }
    },
    KELVIN{
        public double celsius;
        @Override
        public String getBaseUnit() {
       return celsius + "273.15";
        }
    },
    MOLE{
        @Override
        public String getBaseUnit() {
            return "6.02E23";
        }
    },
    CANDELA{
        public double luminousFlux;
        public double bodyAngle;
        @Override
        public String getBaseUnit() {
            return null;
        }
    };


    public abstract String getBaseUnit();
}
