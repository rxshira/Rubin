package com.shira.module1._1;

public class TwoDShape {

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

    public double getArea(){
        return width * height;
    }

    public void setHeight(double height) throws Exception{
        if(height <= 0){
            throw new Exception("Height must be positive number");
        }
        this.height = height;
    }
}
