package com.lessons.model.entity;

public class Triangle extends Shape {
    public double s1;
    public double s2;
    public double s3;

    public Triangle(String colorShape, double s1, double s2, double s3){
        super(colorShape);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double calcArea() {
            double p = (s1 + s2 + s3) / 2;
            return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
    }

    @Override
    public String toString() {
        return super.toString()  +
                " s1 = " + s1 +
                ", s2 = " + s2 +
                ", s3 = " + s3;
    }

}
