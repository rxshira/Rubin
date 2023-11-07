package com.shira.module1._4;

/** An abstract class that represents an two dimensional shape.
 * @author Shira Rubin
 * @version 4
*/
public abstract class TwoDShape {

    /**
     * The width of the shape
     */
    protected double width;
    /**
     * The height of the shape
     */
    protected double height;
    /**
     * The colour of the shape
     */
    protected Colour colour;

    /**
     * Creates a colourless shape with default width and height
     */
    public TwoDShape() throws Exception {
        this(Colour.NONE);
    }

    /**
     * Creates a shape with the default width and height and with the provided
     * colour
     * 
     * @param colour The colour of the shape
     */
    public TwoDShape(Colour colour) throws Exception {
        this(1, 1, colour);
    }

    /**
     * Creates a shape with the provided width, height, and colour
     * 
     * @param width  The width of the created shape
     * @param height The height of the created shape
     * @param colour The colour of the created shape
     * @throws Exception if the height or width are not a positive number
     */
    public TwoDShape(double width, double height, Colour colour) throws Exception {
        if (width <= 0 || height <= 0) {
            throw new Exception("Shape dimensions must be positive number");
        }
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    /**
     * Gets the area of the shape
     * @return A double representing the area of the shape
     */
    public abstract double getArea();

    /**
     * Sets the height of the shape
     * 
     * @param height The new height of the shape
     * @throws Exception if the provided height is not a positive number
     */
    public void setHeight(double height) throws Exception {
        if (height <= 0) {
            throw new Exception("Height must be positive number");
        }
        this.height = height;
    }

    /**
     * Sets the width of the shape
     * 
     * @param width The new width of the shape
     * @throws Exception if the provided width is not a positive number
     */
    public void setWidth(double width) throws Exception {
        if (width <= 0) {
            throw new Exception("Width must be positive number");
        }
        this.width = width;
    }

    /** Gets the height of the shape
     * @return A double representing the height of the shape
     */
    public double getHeight() {
        return height;
    }

    /** Gets the width of the shape
     * @return A double representing the width of the shape
     */
    public double getWidth() {
        return width;
    }
}
