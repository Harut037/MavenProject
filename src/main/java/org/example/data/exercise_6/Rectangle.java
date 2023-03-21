package org.example.data.exercise_6;

public class Rectangle extends Shape{

    private double length;
    private double width;


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    /**
     * This method calculate area of rectangle
     * @return that area
     */
    @Override
    public double getArea() {
        return length * width;
    }


    /**
     * This method calculate perimeter of rectangle
     * @return that perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
