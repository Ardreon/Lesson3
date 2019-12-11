package com.lessons.model.entity;

public class Rectangle extends Shape {
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




    //Этот метод не вызывается
    public String errorMethod(){
        return "No errors";
    }
}
