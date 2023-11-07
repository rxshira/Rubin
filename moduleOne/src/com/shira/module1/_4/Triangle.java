package com.shira.module1._4;

/**
 * A class that represents a triangle.
 * 
 * @author Shira Rubin
 * @version 4
 */

public class Triangle extends TwoDShape implements Rotate {

    /**
     * Side 1 of the triangle. This is also the triangle's width.
     */
    protected double side1;

    /**
     * Side 2 of the triangle
     */
    protected double side2;

    /**
     * Side 3 of the triangle
     */
    protected double side3;

    /**
     * The rotation angle of the triangle.
     */
    protected double angle;

    /**
     * Creates a triangle with the given width, height, an colour.
     * 
     * @param width  The width of the triangle
     * @param height The height of the triangle
     * @param colour The colour of the triangle
     * @throws Exception if either the width or the height are not a positive number
     */
    public Triangle(double width, double height, Colour colour) throws Exception {
        super(width, height, colour);
    }

    /**
     * Creates a triangle with the given sides' length and colour
     * 
     * @param side1  Side 1 of the triangle, also this is the triangle's width
     * @param side2  Side 2 of the triangle
     * @param side3  Side 3 of the triangle
     * @param colour The colour of the triangle
     * @throws Exception if any of the sides of the triangle is not a positive
     *                   number
     */
    public Triangle(double side1, double side2, double side3, Colour colour) throws Exception {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new Exception("Triangle side must be positive number");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.width = side1;
        this.height = heronsHeight();
        this.angle = 0;
        this.colour = colour;
    }

    /**
     * Calculates the height of the triangle using heron's method
     * 
     * @return A double representing the height of the triangle
     */
    private double heronsHeight() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return 2 * area / width;
    }

    /**
     * Gets the area of the triangle
     * 
     * @return A double representing the area of the triangle
     */
    @Override
    public double getArea() {
        return this.width * this.height / 2.0;
    }

    /**
     * @return the string representation of the triangle
     */
    @Override
    public String toString() {
        return "Triangle with sides: " + side1 + ", " + side2 + ", " + side3;
    }

    /**
     * Rotates the trinagle by 90 degrees
     */
    @Override
    public void rotate90() {
        rotate(90);
    }

    /**
     * Rotates the trinagle by 180 degrees
     */
    @Override
    public void rotate180() {
        rotate(180);
    }

    /**
     * Rotates the trinagle by the provided angle
     * 
     * @param angle The angle to rotate the triangle, measured in degrees
     */
    @Override
    public void rotate(double angle) {
        this.angle += angle;
        this.angle %= 360;
    }
}
