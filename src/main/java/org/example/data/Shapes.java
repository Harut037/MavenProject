package org.example.data;

public enum Shapes {

//    Write an enum representing the different types of shapes, with each
//            shape having a method to calculate its area.

    TRIANGLE {
        @Override
        public double area(double... d) {
            double area = d[0] * d[1] * 0.5;
            System.out.println("Area of triangle = " + area);
            return area;
        }
    },
    SQUARE {
        @Override
        public double area(double... d) {
            area = Math.pow(d[0], 2);
            System.out.println("Area of square = " + area);
            return area;
        }
    },
    RECTANGLE {
        @Override
        public double area(double... d) {
            area = d[0] * d[1];
            System.out.println("Area of rectangle = " + area);
            return area;
        }
    },

    CIRCLE {
        @Override
        public double area(double... d) {
            area = Math.PI * Math.pow(d[0], 2);
            System.out.println("Area of circle = " + area);
            return 0;
        }
    };

    public double area;

    public abstract double area(double... d);
}
