package com.shira.module1._2;

public abstract class TwoDShape {

    protected double width;
    protected double height;

    public TwoDShape(double width, double height) throws Exception{
        if(width <= 0 || height <= 0){
            throw new Exception("Shape dimensions must be positive number");
        }
        this.width = width;
        this.height = height;
    }

    public TwoDShape() throws Exception{
        this(1,1);
    }

    public abstract double getArea();
    
    public void setHeight(double height) throws Exception{
        if(height <= 0){
            throw new Exception("Height must be positive number");
        }
        this.height = height;
    }

    public void setWidth(double width)  throws Exception{
        if(width <= 0){
            throw new Exception("Width must be positive number");
        }
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }
}
