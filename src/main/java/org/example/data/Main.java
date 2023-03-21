package org.example.data;

import org.example.data.exercise_6.ShapeType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//   1. Create a data package.
//      Create a new public enum called Planets.
//      Add a name field to the planets.
//      Create a name property to display a non-capitalized version of each of the planet names.
//      Add a constructor with the name field and a getter for the field.
//      Add a new field called yearLength.
//      The value of each yearLength should be the number of earth days of a year on the given planet.
//      Number of earth days on each planet:
//        oMercury: 88
//        oVenus: 225
//        oEarth: 365
//        oMars: 687
//        oJupiter: 4333
//        oSaturn: 10759
//        oUranus: 30687
//        oNeptune: 60200
//      Update the constructor and add a getter for this field.
//      Do a test in the main class.


        Planets planets = Planets.MARS;
        planets.planets(planets);
        System.out.println("-------------------------------------");


        // 2. Create an enum representing the days of the week, and write a method to
        //    return the number of the day.

        DaysOfWeek dow = DaysOfWeek.MONDAY;
        System.out.println("Today is day " + dow.getDayNumber(DaysOfWeek.WEDNESDAY) + "\n");
        System.out.println("--------------------------------------");

        // 3. Write an enum representing the different types of shapes, with each
        //    shape having a method to calculate its area.

        Shapes shapes = Shapes.TRIANGLE;
        shapes.area(5, 7);
        System.out.println("-----------------------------------------");

        // 4. Write an enum representing the different types of planets in our solar
        //    system, with each planet having a method to return its distance from the sun.

        SolarSystem solarSystem = SolarSystem.VENUS;
        System.out.println(solarSystem.distanceFromSun());
        System.out.println("------------------------------------------");


        // 5. Create a Java enum called Unit that represents the following units of
        //    measure: METER, KILOGRAM, SECOND, AMPERE, KELVIN, MOLE, and
        //    CANDELA. Each unit should have a method called getBaseUnit() that
        //    returns the base unit of measure (either itself, or the unit it is derived
        //    from). For example, the base unit of measure for KILOGRAM is itself, but
        //    the base unit of measure for NEWTON (a derived unit) is KILOGRAM * METER / SECOND^2.




        // 6. Create an abstract class called Shape that has two abstract methods:
        //    getArea() and getPerimeter(). Then create an enum called ShapeType
        //    that represents different types of shapes, such as CIRCLE, SQUARE, and
        //    RECTANGLE. Each enum value should have a reference to a concrete
        //    subclass of Shape that implements the getArea() and getPerimeter()
        //    methods for that shape.
        System.out.print("Choose shapes` [ Square, Circle, Rectangle ]   ");
        Scanner sc = new Scanner(System.in);
        ShapeType st = ShapeType.valueOf(sc.nextLine().toUpperCase());
        st.print();
    }

}
