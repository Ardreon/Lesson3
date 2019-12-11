package com.lessons.model.entity;

public class Circle extends Shape {
    private double radius;

    public Circle(String colorShape, double radius) {
        super(colorShape);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return 3.1415 * 2 * radius;
    }


    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }



    //Этот метод не вызывается
    public String errorMethod(){
        return "No errors";
    }

}