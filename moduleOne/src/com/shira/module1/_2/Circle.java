package com.shira.module1._2;

public class Circle extends TwoDShape {

    public static final double PI = Math.PI;
    private double radius;

    public Circle(double radius) throws Exception{
        if(radius <= 0){
            throw new Exception("Radius must be a positive number");
        }
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return PI*radius*radius;
    }

    @Override
    public String toString(){
        return "Circle with radius of:"+radius;
    }
    
}
