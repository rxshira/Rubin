package com.shira.module1._3;

public class Triangle extends TwoDShape implements Rotate{
    
    protected double side1;
    protected double side2;
    protected double side3;
    protected double angle;

    public Triangle(double width, double height) throws Exception{
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3) throws Exception{
        if(side1 <= 0 || side2 <= 0 || side3 <=0){
            throw new Exception("Triangle side must be positive number");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.width = side1;
        this.angle = 0;
        this.height = heronsHeight();
    }

    private double heronsHeight(){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return 2 * area / width;
    }

    @Override
    public double getArea(){
        return this.width * this.height / 2.0;
    }

    @Override
    public String toString(){
        return "Triangle with sides: "+side1+", "+ side2+", "+side3;
    }

    @Override
    public void rotate90() {
        rotate(90);
    }

    @Override
    public void rotate180() {
        rotate(180);
    }

    @Override
    public void rotate(double angle) {
        this.angle += angle;
        this.angle %= 360;
    }
}
