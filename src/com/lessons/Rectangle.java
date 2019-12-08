package com.lessons;

public class Rectangle extends Shape{
     private static double w;
     private static double h;
     public double r;

    public Rectangle(String colorShape, double w, double h) {
        super(colorShape);
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", w = " + w +
                ", h = " + h;
    }

    @Override
    public double calcArea() {
        return w * h;
    }

/* This is some shit
    public double calcRect(){
        r = r +(w * h);
        return r;
    }

    public double getR() {
        return r;
    }
*/

    //%f 2 знака после точки
    //%s stroka
    @Override
    public void draw() {
        System.out.printf("%s; area = %.2f\n", this, calcArea());
    }

    //Этот метод не вызывается
    public String errorMethod(){
        return "No errors";
    }
}
