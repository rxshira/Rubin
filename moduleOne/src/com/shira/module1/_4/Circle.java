package com.shira.module1._4;

/**
 * A class that represents a circle.
 * 
 * @author Shira Rubin
 * @version 4
 */
public class Circle extends TwoDShape {

    /**
     * The constant PI
     */
    public static final double PI = Math.PI;
    
    /**
     * The radius of the circle
     */
    private double radius;

    /** 
     * Creates a new circle with the given radius and colour
     * @param radius The radius of the circle
     * @param colour The colour of the circle
     * @throws Exception if the radius is not a positive number
     */
    public Circle(double radius, Colour colour) throws Exception {
        if (radius <= 0) {
            throw new Exception("Radius must be a positive number");
        }
        this.radius = radius;
        this.colour = colour;
    }

    /**
     * Gets the area of the circle
     * 
     * @return A double representing the area of the circle
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * @return the string representation of the circle
     */
    @Override
    public String toString() {
        return "Circle with radius of:" + radius;
    }

}
