package com.lessons;

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
        if(((s1 + s2) > s3) || ((s2 + s3) > s1) || ((s1 + s3) > s2) ) {
            double p = (s1 + s2 + s3)/2;
            return Math.sqrt(p*(p - s1)*(p - s2)*(p - s3));
        } else
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()  +
                " s1 = " + s1 +
                ", s2 = " + s2 +
                ", s3 = " + s3;
    }

    @Override
    public void draw() {
        System.out.printf("%s; area = %.2f\n", this, calcArea());
    }

    //Этот метод не вызывается
    public String errorMethod(){
        return "Error! Wrong distances";
    }

}