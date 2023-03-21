package org.example.data.exercise_6;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * This method calculate area of circle
     * @return that area
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * This method calculate perimeter of circle
     * @return that perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
