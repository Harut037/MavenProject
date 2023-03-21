package org.example.data.exercise_6;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    /**
     * This method calculate area of square
     * @return that area
     */
    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    /**
     * This method calculate perimeter of square
     * @return return that perimeter
     */
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
